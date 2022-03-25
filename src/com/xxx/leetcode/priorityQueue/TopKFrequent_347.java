package com.xxx.leetcode.priorityQueue;

import java.util.*;

public class TopKFrequent_347 {
    /**
     * 首先遍历整个数组，并使用哈希表记录每个数字出现的次数，并形成一个「出现次数数组」。找出原数组的前k个高频元素，就相当于找出「出现次数数组」的前k大的值。
     *
     * 最简单的做法是给「出现次数数组」排序。但由于可能有O(N) 个不同的出现次数（其中N为原数组长度），故总的算法复杂度会达到O(NlogN)，不满足题目的要求。
     *
     * 在这里，我们可以利用堆的思想：建立一个小顶堆，然后遍历「出现次数数组」：
     *
     * 如果堆的元素个数小于k，就可以直接插入堆中。
     * 如果堆的元素个数等于k，则检查堆顶与当前出现次数的大小。如果堆顶更大，说明至少有k个数字的出现次数比当前值大，故舍弃当前值；否则，就弹出堆顶，并将当前值插入堆中。
     * 遍历完成后，堆中的元素就代表了「出现次数数组」中前 kk 大的值。
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (pq.size() == k) {
                if (value > pq.peek()[1]) {
                    pq.poll();
                    pq.offer(new int[] {key, value});
                }
            }else {
                pq.offer(new int[] {key, value});
            }
        }
        int[]  res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.peek()[0];
            pq.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = new int [] {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}
