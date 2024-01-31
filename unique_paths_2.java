package org.example;

import java.util.Arrays;

public class unique_paths_2 {
    int[][] t;
    public int paths(int i,int j,int m,int n,int[][] grid){
        if(i>=m || j >= n || i<0 || j<0 || grid[i][j]==1) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(t[i][j] != -1) return t[i][j];
        return t[i][j] = paths(i+1,j,m,n,grid) + paths(i,j+1,m,n,grid);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        t= new int[m][n];
        for(int[] rows : t){
            Arrays.fill(rows,-1);
        }
        return paths(0,0,m,n,obstacleGrid);
    }
}
