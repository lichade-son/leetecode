package com.xxx.leetcode.arrayList;

import java.util.Arrays;

public class MaxiumProduct_628 {
    /*
    首先将数组排序。

如果数组中全是非负数，则排序后最大的三个数相乘即为最大乘积；如果全是非正数，则最大的三个数相乘同样也为最大乘积。

如果数组中有正数有负数，则最大乘积既可能是三个最大正数的乘积，也可能是两个最小负数（即绝对值最大）与最大正数的乘积。

综上，我们在给数组排序后，分别求出三个最大正数的乘积，以及两个最小负数与最大正数的乘积，二者之间的最大值即为所求答案。
     */
//    public static int maxiumProduct(int[] nums){
//        Arrays.sort(nums);
//        int n = nums.length;
//        return Math.max(nums[0] * nums[1] * nums[n-1], nums[n-1] * nums[n-2] * nums[n-3]);
//    }
    /*
    在方法一中，我们实际上只要求出数组中最大的三个数以及最小的两个数，因此我们可以不用排序，用线性扫描直接得出这五个数。
     */
    public static int maxiumProduct(int[] nums){
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int num:
                nums) {
            if (num < min1){
                min2 = min1;
                min1 = num;
            }else if (num < min2){
                min2 = num;
            }
            if (num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if (num > max2){
                max3 = max2;
                max2 = num;
            }else if (num > max3){
                max3 = num;
            }
        }
        return Math.max(min1 * min2 * max1, max1*max2*max3);
    }
}
