package org.example;

import java.util.Arrays;

public class longest_increasing_subsequence {
    public int solve(int ind,int prev_ind,int[] nums,int[][] dp){
        if (ind == nums.length) return 0;
        if (dp[ind][prev_ind+1] != -1) return dp[ind][prev_ind+1];
        int len = 0 + solve(ind+1,prev_ind,nums,dp);
        if (prev_ind == -1 || nums[ind] > nums[prev_ind]){
            len = Math.max(len,1+solve(ind+1,ind,nums,dp));
        }
        return dp[ind][prev_ind+1] = len;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for (int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(0,-1,nums,dp);
    }


    // **************************************** TABULATION *******************************************************

    public int lengthOfLIS_tab(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for (int[] rows:dp){
            Arrays.fill(rows,0);
        }
        for (int ind=n-1;ind>=0;ind--){
            for (int prev_ind=ind-1;prev_ind>=-1;prev_ind--){
                int len = 0 + dp[ind+1][prev_ind+1];
                if (prev_ind == -1 || nums[ind] > nums[prev_ind]){
                    len = Math.max(len,1+dp[ind+1][ind+1]);
                }
                dp[ind][prev_ind+1] = len;
            }
        }
        return dp[0][0];
    }


    // ******************************************* single DP Approach *********************************************

    public int lengthOfLIS_On(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for (int ind=0;ind<n;ind++){
            for (int prev=0;prev<ind;prev++){
                if (nums[prev] < nums[ind]){
                    dp[ind] =Math.max(1+dp[prev] , dp[ind]);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }

}
