package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Palindromic_Substrings_brute_force {
    public boolean check(String s,int i,int j,int[][] dp){
        if(j>i) return true;
        if (dp[i][j] != -1) return dp[i][j] == 1 ? true : false;
        if (s.charAt(i) == s.charAt(j)){
            dp[i][j] = check(s,i+1,j-1,dp) == true ? 1:0;
            return check(s,i+1,j-1,dp);
        }
        dp[i][j] = 0;
        return false;
    }
    public int countSubstrings(String s) {
        int [][] dp = new int[1001][1001];
        int n = s.length();
        for (int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if (check(s,i,j,dp)) count++;
            }
        }
        return count;
    }


    // *************************************** 2.0 ****************************************************************

    // ********************************** BOTTOM UP ***************************************************************

    public int countSubstrings_2(String s) {
        int n = s.length();
        boolean[][] t = new boolean[n][n];

        int count = 0;

        for (int L = 1; L <= n; L++) {
            for (int i = 0; i + L <= n; i++) {
                int j = i + L - 1;

                if (i == j) {
                    t[i][i] = true;
                } else if (i + 1 == j) {
                    t[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    t[i][j] = (s.charAt(i) == s.charAt(j) && t[i + 1][j - 1]);
                }

                if (t[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    // *************************************** 3.0 ****************************************************************

    // ********************************** SMART APPROACH ***************************************************************

    private int count = 0;
    private void check(String s, int i, int j, int n) {
        while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
    }
    public int countSubstrings_3(String s) {
        int n = s.length();
        count = 0;
        for (int i = 0; i < n; i++) {
            check(s, i, i, n);
            check(s, i, i + 1, n);
        }
        return count;
    }
}

