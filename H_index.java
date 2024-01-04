package org.example;

import java.util.Arrays;

public class H_index {
    public int hIndex(int[] citations) {
//        Arrays.sort(citations);
        int low = 0;
        int high = citations.length;
        while (low<=high){
            int mid = (low+high)/2;
            int count = 0;
            for (int i=0;i<citations.length;i++) if (citations[i]>=mid+1) count++;
            if (count>=mid+1) low = mid+1;
            else high=mid-1;
        }
        return low;
     }
}
