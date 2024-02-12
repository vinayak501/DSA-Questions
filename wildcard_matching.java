package org.example;

import java.util.Arrays;

public class wildcard_matching {
    public boolean solve(int i,int j,String s,String p,int[][] dp){
        if (i<0 && j<0) return true;
        if (i<0 && j>=0) return false;
        if (j<0 && i>=0){
            while(i>=0){
                if(p.charAt(i)!='*')return false;
                i--;
            }
            return true;
        }
        if (dp[i][j] != -1) return dp[i][j] == 1 ? true : false;
        if (s.charAt(i) == p.charAt(j) || s.charAt(i) == '?'){
            dp[i][j] = solve(i-1,j-1,s,p,dp) ? 1 : 0;
            return dp[i][j] == 1 ? true :false;
        }
        if (s.charAt(i) == '*'){
            dp[i][j] = (solve(i-1,j,s,p,dp) || solve(i,j-1,s,p,dp)) == true ?1: 0;
            return dp[i][j] == 1 ? true :false;
        }
        return false;
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n+1][m+1];
        for (int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return solve(n-1,m-1,s,p,dp);
    }
}
