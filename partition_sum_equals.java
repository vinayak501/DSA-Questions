package org.example;

import java.util.Arrays;

public class partition_sum_equals {
    static boolean solve(int ind,int target,int []nums,int [][]dp){
        if(target == 0) return true;
        if(ind==0){
            if(nums[ind] == target) return true;
            else return false;
        }
        if (dp[ind][target] != -1) return dp[ind][target] == 0 ? false : true;
        boolean nottake = solve(ind-1,target,nums,dp);
        boolean take = false;
        if(nums[ind] <= target){
            take = solve(ind-1,target-nums[ind],nums,dp);
        }
        dp[ind][target] = nottake || take ? 1 : 0;
        return nottake || take;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[1001][1001];
        for (int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        int totsum = 0;
        for (int i:nums){
            totsum+=i;
        }
        if (totsum % 2 != 0) return false;
        int target = totsum/2;
        return solve(n-1,target,nums,dp);
    }

}
