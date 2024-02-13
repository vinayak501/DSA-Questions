package org.example;

import java.util.Arrays;

public class best_time_buy_sell_stock_3 {
    public int solve(int ind,int buy,int cap,int[] prices,int n,int[][][] dp){
        if (ind == n) return 0;
        if (cap == 0) return 0;
        if (dp[ind][buy][cap] != -1) return dp[ind][buy][cap];
        int profit = Integer.MIN_VALUE;
        if (buy == 1){
            profit = Math.max(-prices[ind] + solve(ind+1,0,cap,prices,n,dp),0 + solve(ind+1,1,cap,prices,n,dp));
        }else {
            profit = Math.max(prices[ind] + solve(ind+1,1,cap-1,prices,n,dp) , 0 + solve(ind+1,0,cap,prices,n,dp));
        }
        return dp[ind][buy][cap] = profit;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        for (int[][] rows : dp){
            for (int[] i : rows){
                Arrays.fill(i,-1);
            }
        }
        return solve(0,1,2,prices,n,dp);
    }



// *********************************** TABULATION **************************************************************

    static int maxProfit_2(int[] prices) {
        int n = prices.length;

        // Creating a 3D dp array of size [n+1][2][3] initialized to 0
        int[][][] dp = new int[n + 1][2][3];

        // Loop through the dp array, starting from the second last stock (ind=n-1)
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= 2; cap++) {

                    if (buy == 0) { // We can buy the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][0][cap],
                                -prices[ind] + dp[ind + 1][1][cap]);
                    }

                    if (buy == 1) { // We can sell the stock
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][1][cap],
                                prices[ind] + dp[ind + 1][0][cap - 1]);
                    }
                }
            }
        }

        // The maximum profit with 2 transactions is stored in dp[0][0][2]
        return dp[0][0][2];
    }

}

