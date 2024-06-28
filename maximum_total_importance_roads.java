package org.example;

import java.util.Arrays;

public class maximum_total_importance_roads {
    public long maximumImportance(int n, int[][] roads) {
        int []degree = new int[n];
        for (int[] road : roads){
            int u = road[0];
            int v = road[1];
            degree[u]++;
            degree[v]++;
        }
        Arrays.sort(degree);
        long val = 1;
        long ans = 0;
        for (int i=0;i<n;i++){
            ans += (val*degree[i]);
            val++;
        }
        return ans;
    }
}
