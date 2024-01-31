package org.example;

import java.util.Arrays;

public class unique_paths {
    int[][] t;
    public int paths(int i,int j,int m,int n){
        if(i>m || j > n || i<0 || j<0) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(t[i][j] != -1) return t[i][j];
        return t[i][j] = paths(i+1,j,m,n) + paths(i,j+1,m,n);
    }
    public int uniquePaths(int m, int n) {
        t= new int[m][n];
        for(int[] rows : t){
            Arrays.fill(rows,-1);
        }
        return paths(0,0,m,n);
    }
}
