package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class count_element_With_max_freq {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int maxfreq = 0;
        int totalSum = 0;
        Arrays.fill(count,0);
        for (int num : nums){
            count[num]++;
            int freq = count[num];
            if (freq > maxfreq){
                maxfreq = freq;
                totalSum = maxfreq;
            }else if(freq == maxfreq){
                totalSum += maxfreq;
            }
        }
        return totalSum;
    }
}
