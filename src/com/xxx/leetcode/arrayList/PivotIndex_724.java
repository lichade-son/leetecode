package com.xxx.leetcode.arrayList;

import java.util.Arrays;

/*
给你一个整数数组nums，请编写一个能够返回数组 “中心下标” 的方法。

数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。

如果数组不存在中心下标，返回 -1 。如果数组有多个中心下标，应该返回最靠近左边的那一个。
 */
public class PivotIndex_724 {
    /*
    方法一：前缀和
思路
记数组的全部元素之和为total，当遍历到第 ii 个元素时，设其左侧元素之和为sum，则其右侧元素之和为total−nums[i]−sum。左右侧元素相等即为sum=total−nums [i]−sum，即2×sum+nums
i=total。*/

    public static int pivotIndex(int[] nums){
        int sum = 0;
        int total = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++){
            if ((sum*2 + nums[i]) == total){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
