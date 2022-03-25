package com.xxx.leetcode.arrayList;

/*
给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。

连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 */
public class FindLengthOfLCIS_674 {
    public static int findLengthOfLCIS(int[] nums){
        int max = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] < nums[i+1]){
                count++;
            }else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        return Math.max(max, count);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        System.out.println(findLengthOfLCIS(nums));
        char[] ch = new char[] {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'
        };
        int[] num = new int[] {
                1, 2, 3, 4, 5
        };
        String[] str = new String[100];
        for (int i = 0; i < str.length; i++) {
            str[i] = "jkilhg" + ch[i%20] + "45872" + num[i/20];
            System.out.println(str[i]);
        }
    }
}
