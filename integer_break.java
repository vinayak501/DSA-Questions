package org.example;

import java.util.Arrays;

public class integer_break {
    int[] dp;
    public int solve(int n){
        if (n <= 1) return 0;
        if (dp[n] != -1) return dp[n];
        int ans = Integer.MIN_VALUE;
        for (int i=1;i<n;i++){
            ans = Math.max(ans,Math.max(i * (n-i),i*solve(n-i)));
        }
        return dp[n] = ans;
    }
    public int integerBreak(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
}
