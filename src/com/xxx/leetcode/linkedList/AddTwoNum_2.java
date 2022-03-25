package com.xxx.leetcode.linkedList;

import java.util.HashMap;
import java.util.Map;

public class AddTwoNum_2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int l = nums.length;
        for (int i = 0; i < l; i++){
            if(map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[1];
    }
}
