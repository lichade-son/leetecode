package com.xxx.leetcode.arrayList;

/*
使用最小花费爬楼梯
数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值ost[i]（下标从 0 开始）。

每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。

请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。

动态规划方法：
创建长度为n+1 的数组dp，其中dp[i] 表示达到下标i 的最小花费。

由于可以选择下标0 或1 作为初始阶梯，因此有dp[0]=dp[1]=0。

当2≤i≤n 时，可以从下标i−1 使用cost[i−1] 的花费达到下标i，或者从下标i−2 使用cost[i−2] 的花费达到下标 ii。为了使总花费最小，dp[i] 应取上述两项的最小值，因此状态转移方程如下：

dp[i]=min(dp[i−1]+cost[i−1],dp[i−2]+cost[i−2]) 此外可用滚动数组进行优化
 */
public class MinCostClimbingStairs_746 {
    public static int minCostClimbingStairs(int[] cost){
//        int n = cost.length;
//        int[] dp = new int[n + 1];
//        dp[0] = dp[1] = 0;
//        for (int i = 2; i <= n; i ++){
//            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
//        }
//        return dp[n];

        int n = cost.length;
        int pre = 0, cur = 0;
        for (int i = 2; i <= n; i++){
            int next = Math.min(cur + cost[i-1], pre + cost[i-2]);
            pre = cur;
            cur = next;
        }
        return cur;
    }
}
