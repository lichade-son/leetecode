package com.xxx.leetcode.arrayList;

import java.util.TreeSet;

public class TheThirdMax_414 {
    //使用Treeset内部会自动升序排序，由于set所以元素都是唯一的
    public int theThirdMax(int[] nums){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums){
            set.add(i);
            if (set.size() > 3){
                set.pollFirst();
            }
        }
        if (set.size() < 3){
            return set.pollLast(); //返回set中最后一元素并删除
        }else {
            return set.pollFirst(); //返回set中第一元素并删除
        }
    }
}
