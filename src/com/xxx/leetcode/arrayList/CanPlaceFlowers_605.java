package com.xxx.leetcode.arrayList;

public class CanPlaceFlowers_605 {
    /*
    维护prev表示上一朵已经种植的花的下标位置，初始时prev=−1，表示尚未遇到任何已经种植的花。

    从左往右遍历数组flowerbed，当遇到flowerbed[i]=1 时根据prev和i的值计算上一个区间内可以种植花的最多数量，然后令prev=i，继续遍历数组flowerbed剩下的元素。

    遍历数组flowerbed结束后，根据数组prev和长度m的值计算最后一个区间内可以种植花的最多数量。

    判断整个花坛内可以种入的花的最多数量是否大于或等于n。
     */
    public static boolean canPlaceFlowers(int[] nums, int n){
        int l = nums.length;
        int prev = -1;
        int count = 0;
        for (int i = 0; i < l; i++){
            if (nums[i] == 1){
                if (prev < 0 ){
                    count += i/2;
                }else {
                    count += (i - prev - 2)/2;
                }
            }
            prev = i;
        }
        if (prev < 0){
            count += (l+1)/2;
        }else {
            count += (l - prev - 1)/2;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(nums,n));
    }
}
