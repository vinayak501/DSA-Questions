package org.example;

import java.util.Arrays;

public class coins_change {
    public int solve(int index,int target,int[] coins,int[][] dp){
        if (index==0){
            if (target%coins[index] == 0) return target/coins[index];
            return (int)1e9;
        }
        if (dp[index][target] != -1) return dp[index][target];
        int nottake = solve(index-1,target,coins,dp);
        int take = Integer.MAX_VALUE;
        if (coins[index] <= target ) {
            take = 1+solve(index,target-coins[index],coins,dp);
        }
        return dp[index][target] = Math.min(nottake,take);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp =  new int[n][amount];
        for (int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        int ans = solve(n-1,amount,coins,dp);
        if(ans >= (int)1e9) return -1;
        else return ans;
    }
}
