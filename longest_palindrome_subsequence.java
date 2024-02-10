package org.example;

import java.util.Arrays;

public class longest_palindrome_subsequence {
    public int solve(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int[n+1][m+1];
        for (int i=0;i<n-1;i++) dp[i][0] = 0;
        for (int j=0;j<m-1;j++) dp[0][j] = 0;
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder t = new StringBuilder(s);
        t.reverse();
        return solve(s,t.toString());
    }
}
