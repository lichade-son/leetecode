package com.xxx.leetcode.arrayList;

public class 两数之和_II_输入有序数组 {
    public int[] twoNum(int[] nums, int target){
        /*
        双指针解法：
        int left=0,right = numbers.length - 1;
        while(left<right){
            int num = numbers[left]+numbers[right];
            if(num == target){
                return new int[] {left+1,right+1};
            }
            else if(num > target){
                --right;
            }
            else{
                ++left;
            }
        }
        return new int[] {-1,-1};
         */
        int [] arr;
        for(int i=0; i< nums.length;i++){
            for(int j=i; j>=0;j--){
                if ((nums[i+1] + nums[j]) == target){
                    arr = new int[]{j+1, i+2};
                    return arr;
                }
            }
        }
        arr = new int[] {0, 0};
        return arr;
    }
    public void printArr(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
       两数之和_II_输入有序数组 tn = new 两数之和_II_输入有序数组();
       int[] nums = {2,7,11,15};
       int target = 9;
       tn.printArr(tn.twoNum(nums, target));
    }
}
