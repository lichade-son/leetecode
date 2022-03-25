package com.xxx.leetcode.arrayList;

import java.util.Arrays;

public class ArrayPairSum_561 {
    //排序之后取第二大的数.
    public static int arrayPairSum(int[] nums){
        int sum = 0;
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length-1){
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}
