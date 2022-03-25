package com.xxx.leetcode.queue;

import java.util.Deque;
import java.util.LinkedList;

/*
给你一个整数数组 nums，有一个大小为的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k个数字。滑动窗口每次只向右移动一位。

返回滑动窗口中的最大值。

 */
public class MaxSlidingWindow_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList();
        int[] max = new int [nums.length - k + 1];
        deque.push(0);
        for(int i = 1; i < k; i++) {
            while(!deque.isEmpty() && nums[i] > nums[deque.peek()]) {
                deque.pop();
            }
            deque.push(i);
        }
        // System.out.println(nums[deque.peek()]);
        max[0] = nums[deque.peekLast()];
        for(int i = k; i < nums.length; i++) {
            while(!deque.isEmpty() && deque.peekLast() < i - k + 1){
                deque.removeLast();
            }
            while(!deque.isEmpty() && nums[i] > nums[deque.peek()]) {
                deque.pop();
            }
            deque.push(i);
            max[i - k + 1] = nums[deque.peekLast()];
        }
        return max;
    }
}
