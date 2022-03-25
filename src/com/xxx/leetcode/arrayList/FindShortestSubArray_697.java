package com.xxx.leetcode.arrayList;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray_697 {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }
        int maxNum = 0, minLength = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            if (entry.getValue()[0] > maxNum) {
                maxNum = entry.getValue()[0];
                minLength = entry.getValue()[2] - entry.getValue()[1] + 1;
            }else if (entry.getValue()[0] == maxNum ){
                if (minLength > entry.getValue()[2] - entry.getValue()[1]){
                    minLength = entry.getValue()[2] - entry.getValue()[1] + 1;
                }
            }
        }
        return minLength;
    }
}
