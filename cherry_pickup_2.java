package org.example;

import java.util.Arrays;

public class cherry_pickup_2 {
    static int solve(int i,int j1,int j2,int[][] grid,int[][][] dp){
        int n = grid.length;
        int m = grid[0].length;
        if(j1 < 0 || j2 < 0 || j1 >= m || j2 >= m) return Integer.MIN_VALUE;
        if(i == n-1) {
            if(j1==j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        int res = 0;
        if (dp[i][j1][j2] != -1) return dp[i][j1][j2];
        for (int dj1=-1;dj1<=1;dj1++){
            for (int dj2=-1;dj2<=1;dj2++){
                int value = 0;
                if (j1==j2) value=grid[i][j1];
                else value = grid[i][j1] + grid[i][j2];
                res = Math.max(res,value+solve(i+1,j1+dj1,j2+dj2,grid,dp));
            }
        }
        return dp[i][j1][j2] = res;
    }
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for (int[][] rows : dp){
            for (int[] i : rows){
                Arrays.fill(i,-1);
            }
        }
        return solve(0,0,m-1,grid,dp);
    }
}
