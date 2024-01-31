package org.example;

import java.util.Arrays;

public class ninja_training {
    public static int solve(int day, int last, int points[][], int dp[][]){
        if(dp[day][last]!=-1) return dp[day][last];
        if(day == 0){
            int maxi = 0;
            for (int i=0;i<3;i++){
                if(i!=last){
                    maxi = Math.max(maxi,points[0][i]);
                }
            }
            return maxi;
        }
        int maxi =0;
        for (int i=0;i<3;i++){
            if (i!=last){
                int point = points[day][i] + solve(day-1,i,points,dp);
                maxi=Math.max(point,maxi);
            }
        }
        return dp[day][last] = maxi;

    }
    public static int ninjaTraining(int n, int points[][]) {
        int[][] dp = new int[n][4];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return solve(n-1,3,points,dp);
    }
}
