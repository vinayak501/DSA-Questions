package org.example;

import java.util.Arrays;

public class student_attendence_2 {
    int M = 100000007;
    private int[][][] award = new int[100001][2][3];
    public int solve(int n,int absent,int late_s){
        if (absent >=2 || late_s >= 3) return 0;
        if (n <= 0) return 1;
        if (award[n][absent][late_s] != -1) return award[n][absent][late_s];
        int a = solve(n-1,absent+1,0) % M;
        int l = solve(n-1,absent,late_s+1) % M;
        int p = solve(n-1,absent,0) % M;
        return award[n][absent][late_s] = ((a + l) % M + p) % M;
    }
    public int checkRecord(int n) {
        for (int[][] rows : award){
            for (int[] r : rows){
                Arrays.fill(r,-1);
            }
        }
        return solve(n,0,0);
    }
}
