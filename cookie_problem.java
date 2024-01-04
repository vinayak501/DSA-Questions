package org.example;

import java.util.Arrays;

public class cookie_problem {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length;
        int n = s.length;
        int i=0,j=0;
        while (i<n && j<m){
            if(g[j]<=s[i]){
                j++;
            }
            i++;
        }
        return j;
    }
}
