package com.xxx.leetcode.arrayList;

import java.util.ArrayList;
import java.util.List;
/*
给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
使用摩尔投票法
 */

public class 众数_II_66 {
    public List<Integer> majorityElement(int[] nums){
        int num1 = nums[0], num2 = nums[0], count1 = 0, count2 = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == num1){
                count1++;
            }else if (nums[i] == num2){
                count2++;
            }
            else if (count1 == 0){
                num1 = nums[i];
                count1 = 1;
            }else if (count2 == 0){
                num2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == num1){
                count1++;
            }
            else if (nums[i] == num2){
                count2++;
            }
        }
        if (count1 > nums.length/3){
            res.add(num1);
        }
        if (count2 > nums.length/3){
            res.add(num2);
        }
        return res;
    }

    public void printArr(List<Integer> nums){
        for (int i = 0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
    }

    public static void main(String[] args) {
        众数_II_66 mm = new 众数_II_66();
        int[] nums = {1,1,1,3,3,2,2,2};
        mm.printArr(mm.majorityElement(nums));
//        Runtime rm = Runtime.getRuntime();
//        System.out.println(rm.availableProcessors());  //可用进程数即电脑有几个cpu内核
    }
}
