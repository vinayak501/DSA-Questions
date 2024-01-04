package org.example;

import java.util.Arrays;

public class String_Compression_2 {
    int[][][][] t = new int[101][27][101][101];
    int solve(String s,int i,int prev_char,int freq,int k){
        if(k<0) return Integer.MAX_VALUE;
        if(i>=s.length()) return 0;
        if(t[i][prev_char][freq][k]!=-1) return t[i][prev_char][freq][k];
        int delete_i = solve(s,i+1,prev_char,freq,k-1);
        int keep_i = 0;
        if(s.charAt(i) != prev_char){
            keep_i = 1 + solve(s,i+1,s.charAt(i)-'a',1,k);
        }else {
            int one_more_addition = 0;
            if(freq == 1 || freq == 9 || freq == 99){
                one_more_addition = 1;
            }
            keep_i =one_more_addition + solve(s,i+1,prev_char,freq+1,k);
        }
        return t[i][prev_char][freq][k] = Math.min(delete_i,keep_i);
    }

    public int getLengthOfOptimalCompression(String s, int k) {
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 27; j++) {
                for (int x = 0; x < 101; x++) {
                    Arrays.fill(t[i][j][x], -1);
                }
            }
        }
        return solve(s,0,26,0,k);
    }
}
