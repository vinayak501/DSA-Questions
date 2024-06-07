package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class non_overlapping_interval {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        int last_included = 0;
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0] < intervals[last_included][1]){
                count++;
                if (intervals[i][1] < intervals[last_included][1]){
                    last_included = i;
                }
            }else {
                last_included = i;
            }
        }
        return count;
    }
}
