package com.xxx.leetcode.arrayList;

public class BestTime2BuyStock2 {

    //dynamic programming
    int maxProfit(int[] prices){
        int dp0 = 0, dp1 = -prices[0];
        for (int i = 0; i < prices.length; i++){
            int dp0new = Math.max(dp0, dp1 + prices[i]);
            int dp1new = Math.max(dp0 - prices[i], dp1);
            dp0 = dp0new;
            dp1 = dp1new;
        }
        return dp0;
    }
}
