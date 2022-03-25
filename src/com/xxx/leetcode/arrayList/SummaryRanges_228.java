package com.xxx.leetcode.arrayList;

import java.util.ArrayList;
import java.util.List;
/*
给定一个无重复元素的有序整数数组 nums 。

返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 */
public class SummaryRanges_228 {
    public static List<String> summaryRanges(int[] nums){
        List<String> list = new ArrayList<>();
        if (nums.length == 0){
            return list;
        }
        int start = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1] + 1){
                if (nums[i-1] != start){
                    list.add(start + "->" + nums[i-1]);
                    start = nums[i];
                }else {
                    list.add(String.valueOf(start));
                    start = nums[i];
                }
            }else if (i == nums.length - 1){
                list.add(start + "->" + nums[i]);
                return list;
            }
        }
        list.add(String.valueOf(nums[nums.length - 1]));
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(SummaryRanges_228.summaryRanges(nums));
    }
}
