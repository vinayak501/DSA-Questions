package org.example;

import java.util.Arrays;

public class max_sum_after_partition {
    static int solve(int i,int[] arr,int k,int[] dp){
        int n = arr.length;
        if(i>=n) return 0;
        if(dp[i] != -1) return dp[i];
        int res=0;
        int curr_max = -1;
        for (int j = i;j<n && j-i+1 <= k;j++){
            curr_max = Math.max(curr_max,arr[j]);
            res = Math.max(res,curr_max*(j-i+1) + solve(i+1,arr,k,dp));
        }
        return dp[i] = res;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return solve(0,arr,k,dp);
    }
}
