package org.example;

import java.util.Arrays;

public class coins_change_2 {
    public int solve(int index,int target,int[] coins,int[][] dp){
        if (index == 0){
            if (target % coins[index] == 0) return 1;
            return 0;
        }
        if (dp[index][target] != -1) return dp[index][target];
        int nottake = solve(index-1,target,coins,dp);
        int take = 0;
        if (coins[index] <= target){
            take = solve(index,target-coins[index],coins,dp);
        }
        return dp[index][target] = nottake+take;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for (int[] rows : dp) Arrays.fill(rows,-1);
        return solve(n-1,amount,coins,dp);
    }
}
