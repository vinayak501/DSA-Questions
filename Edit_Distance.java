package org.example;

import java.util.Arrays;

public class Edit_Distance {
    public int solve(int i,int j,String s,String t,int[][] dp){
        if(j<0) return i+1;
        if(i<0) return j+1;
        if (dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)) return dp[i][j] = solve(i-1,j-1,s,t,dp);
        int insert = 1 + solve(i,j-1,s,t,dp);
        int delete = 1 + solve(i-1,j,s,t,dp);
        int replace = 1 + solve(i-1,j-1,s,t,dp);
        return dp[i][j] = Math.min(Math.min(insert,delete),replace);
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for (int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return solve(n-1,m-1,word1,word2,dp);
    }
}
