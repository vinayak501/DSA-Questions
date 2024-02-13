package org.example;

import java.util.Arrays;

public class best_time_buy_sell_stock_4 {
    public static int getAns(int[] prices, int n, int ind, int buy, int cap, int[][][] dp) {
        // Base case
        if (ind == n || cap == 0) {
            return 0;
        }

        // If the result is already calculated, return it
        if (dp[ind][buy][cap] != -1) {
            return dp[ind][buy][cap];
        }

        int profit;

        if (buy == 0) { // We can buy the stock
            profit = Math.max(0 + getAns(prices, n, ind + 1, 0, cap, dp),
                    -prices[ind] + getAns(prices, n, ind + 1, 1, cap, dp));
        } else { // We can sell the stock
            profit = Math.max(0 + getAns(prices, n, ind + 1, 1, cap, dp),
                    prices[ind] + getAns(prices, n, ind + 1, 0, cap - 1, dp));
        }

        // Store the result in dp and return it
        dp[ind][buy][cap] = profit;
        return profit;
    }
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][k + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return getAns(prices, n, 0, 0, k, dp);
    }
}
