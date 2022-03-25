package com.xxx.leetcode.arrayList;

public class FindMaxAverage_643 {
    public static double findMaxAverage(int[] nums, int k){
        double max = 0;
        for (int i = 0; i < k; i++){
            max += nums[i];
        }
        double temp = max;
        for (int i = k; i < nums.length; i++){
            if (temp - nums[i-k] + nums[i] > max){
                max = temp - nums[i-k] + nums[i];
            }
            temp = temp - nums[i-k] + nums[i];
        }
        return max/k;
    }

    public static void main(String[] args) {
        int[] nums = {0,4,0,3,2};
        System.out.println(findMaxAverage(nums, 1));
    }
}
