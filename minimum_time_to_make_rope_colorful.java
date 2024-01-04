package org.example;

import java.util.ArrayList;
import java.util.Map;

public class minimum_time_to_make_rope_colorful {
    public int minCost(String colors, int[] neededTime) {
        int prev =0;
        int minTime = 0;
        int n = colors.length();
        for(int i=0;i<n;i++){
            int curr = neededTime[i];
            if(i>0 && colors.charAt(i) != colors.charAt(i-1)){
                prev =0;
            }
            minTime += Math.min(prev,curr);
            prev = Math.max(prev,curr);

        }
        return minTime;
    }
}
