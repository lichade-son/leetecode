package com.xxx.leetcode.arrayList;
/*
*给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于n/2的元素。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MostElement_169 {
    public int majorityElement(int[] nums){
        /*
        摩尔投票法，因为多数元素大于n/2，所以多数元素个数减去其余元素个数应该大于等于1，所以可以如下操作:
        候选人(cand_num)初始化为nums[0]，票数count初始化为1。
        当遇到与cand_num相同的数，则票数count = count + 1，否则票数count = count - 1。
        当票数count为0时，更换候选人，并将票数count重置为1。
        遍历完数组后，cand_num即为最终答案。
         */
//        int majorityNum = nums[0], count = 1;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] == majorityNum){
//                count++;
//            }
//            else if(--count == 0){
//                count = 1;
//                majorityNum = nums[i];
//            }
//        }
//        return majorityNum;
        int majorityNum = nums[0], count = 1;
        for(int i=1;i<nums.length;i++){
            if (count == 0){
                majorityNum = nums[i];
                count = 1;
                continue;
            }
            if(nums[i] == majorityNum){
                count++;
            }
            else{
                count--;
            }
        }
        return majorityNum;
    }
}
