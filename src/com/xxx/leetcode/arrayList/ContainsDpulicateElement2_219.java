package com.xxx.leetcode.arrayList;

import java.util.HashSet;
import java.util.Set;

public class ContainsDpulicateElement2_219 {
    //使用散列表维护一个k长度的元素
    /*
    在散列表中搜索当前元素，如果找到了就返回 true。
    在散列表中插入当前元素。
    如果当前散列表的大小超过了 kk， 删除散列表中最旧的元素。
     */
    public boolean containsNearbyDuplicate(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) set.remove(nums[i - k]);
        }
        return false;
    }

}
