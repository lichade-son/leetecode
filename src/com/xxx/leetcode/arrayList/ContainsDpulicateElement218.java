package com.xxx.leetcode.arrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDpulicateElement218 {
    //hash
    /*
    boolean containsDpulicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i< nums.length; i++){
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
     */
    //先排序，再比较相邻元素是否相等
    boolean containsDpulicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i< nums.length;i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
