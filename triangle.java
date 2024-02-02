package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class triangle {
    static int solve(int i,int j,int n,List<List<Integer>> triangle,int[][] dp){
        if(i==n-1) return triangle.get(n-1).get(j);
        if(dp[i][j] != -1) return dp[i][j];
        int down = triangle.get(n-1).get(j) + solve(i+1,j,n,triangle,dp);
        int down_diagonal = triangle.get(n-1).get(j) + solve(i+1,j+1,n,triangle,dp);
        return dp[i][j] = Math.min(down_diagonal,down);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int[] rows : dp) Arrays.fill(rows,-1);
        return solve(0,0,n,triangle,dp);
    }
}
