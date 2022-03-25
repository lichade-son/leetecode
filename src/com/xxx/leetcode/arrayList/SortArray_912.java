package com.xxx.leetcode.arrayList;

import java.util.Arrays;

public class SortArray_912 {
    public static int[] sortArray(int[] nums){
        int l = nums.length - 1;
        while(l > 0) {
            for(int i = 1; i < l + 1; i++){
                if(nums[i] < nums[i-1]) {
                    nums[i] = nums[i] + nums[i-1];
                    nums[i-1] = nums[i] - nums[i-1];
                    nums[i] = nums[i] - nums[i-1];
                }
            }
            l--;
        }
        return nums;
    }

    public static int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int index = partition(nums, left, right);
            quickSort(nums, left, index - 1);
            quickSort(nums, index + 1, right);
        }
        return nums;
    }

    public static int partition(int[] nums, int low, int high) {
        int temp = nums[low];
        boolean flag = true;
        int left = low, right = high;
        while(left < right) {
            if (flag) {
                if (nums[right] < temp) {
                    nums[left] = nums[right];
                    left++;
                    flag = false;
                }else right--;
            }else {
                if (nums[left] > temp) {
                    nums[right] = nums[left];
                    right--;
                    flag = true;
                }else left++;
            }
        }
        nums[left] = temp;
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,55,1,1,2,0,0};
//        System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(quickSort(nums, 0, nums.length - 1)));
    }
}
