package com.xxx.leetcode.arrayList;

public class FindMaxConsecutiveOnes_485 {
    public static int findMaxConsecutiveOnes(int[] nums){
        int left = 0, right = 0, max = 0;
        while (right < nums.length){
            if (nums[right] == 1){
                right++;
            }else {
                if (right - left > max){
                    max = right - left;
                }
                right++;
                left = right;
            }
        }
        if (right - left > max){
            max = right - left;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
