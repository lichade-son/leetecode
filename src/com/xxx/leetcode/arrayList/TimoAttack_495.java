package com.xxx.leetcode.arrayList;

public class TimoAttack_495 {
    public static int findPoisonedDuration(int[] timeSeris, int duration){
        int time = 0;
        for (int i = 0; i < timeSeris.length; i++){
            if (i + 1 < timeSeris.length && timeSeris[i + 1] - timeSeris[i] >= duration){
                time += duration;
            }else if (i + 1 < timeSeris.length && timeSeris[i + 1] - timeSeris[i] < duration){
                time += timeSeris[i + 1] - timeSeris[i];
            }else {
                time += duration;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int duration = 2;
        int[] nums = {1,2};
        System.out.println(findPoisonedDuration(nums, duration));
    }
}
