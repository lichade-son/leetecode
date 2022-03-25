package com.xxx.leetcode.arrayList;

/*
给你一个长度为的整数数组，请你判断在 最多 改变1 个元素的情况下，该数组能否变成一个非递减数列。

我们是这样定义一个非递减数列的：对于数组中任意的i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 */
public class CheckPosibility_665 {
    public static boolean checkPosibility(int[] nums){
//        int count = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (count > 1){
//                return false;
//            }
//            if (i + 1< nums.length && nums[i] > nums[i+1]){
//                count++;
//                if (i - 1 >= 0 && nums[i-1] > nums[i+1] && i+2 < nums.length && nums[i] > nums[i+2]){
//                    count++;
//                }
//            }
//        }
//        return true;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++){
            int x = nums[i], y = nums[i+1];
            if (x > y){
                count++;
                if (count > 1){
                    return false;
                }
                if (i > 0 && nums[i-1] > y){
                    nums[i+1] = x;
                }
            }
        }
        return true;
    }
}
