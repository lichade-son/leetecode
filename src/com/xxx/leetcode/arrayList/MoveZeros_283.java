package com.xxx.leetcode.arrayList;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void moveZeros(int[] nums){
        int left = 0, right = 0;
        while (right < nums.length){
            if (nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        for (int i = left; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
