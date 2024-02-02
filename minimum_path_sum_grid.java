package org.example;

import java.util.Arrays;

public class minimum_path_sum_grid {
//    public int minPathSum(int[][] grid) {
//        int row = grid.length;
//        int col = grid[0].length;
//        int [][] dp = new int[row+1][col+1];
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                if(i==0 && j==0) dp[0][0] = grid[0][0];
//                else {
//                    int up = i>0 ? dp[i-1][j] :Integer.MAX_VALUE;
//                    int left = j>0 ? dp[i][j-1] :Integer.MAX_VALUE;
//                    dp[i][j] = Math.min(up,left) + grid[i][j];
//                }
//            }
//        }
//        return dp[row-1][col-1];
//    }
    static int solve(int i,int j,int[][] grid,int[][] dp){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int up = solve(i-1,j,grid,dp);
        int left = solve(i,j-1,grid,dp);
        return dp[i][j] = Math.min(up,left) + grid[i][j];
    }
    public int minPathSum(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        for (int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return solve(row-1,col-1,grid,dp);
    }
}
