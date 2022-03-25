package com.xxx.leetcode.arrayList;

/**
 *给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
 *
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
 */
public class DominantIndex_747 {
    //先找出前两个大的数，同时记录最大数的索引，之后将他们进行比较如果大于或等于两倍返回索引否则返回-1
    public static int dominantIndex(int[] nums){
        if (nums.length == 1) {
            return 0;
        }
        int max = -1, medium = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                medium  = max;
                index = i;
            }else if (nums[i] > medium) {
                medium = nums[i];
            }
        }
        if (max >= 2*medium){
            return index;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
}
