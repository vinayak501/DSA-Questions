package org.example;

import java.util.Arrays;

public class minKbitFlip {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int flips = 0;
        boolean[] isFlipped = new boolean[n];
        int flipCountFromPastToCurr = 0;
        for (int i=0;i<n;i++){
            if (i>=k && isFlipped[i-k]){
                flipCountFromPastToCurr--;
            }
            if(flipCountFromPastToCurr % 2 == nums[i]){
                if (i + k > n) return -1;
                flipCountFromPastToCurr++;
                isFlipped[i] = true;
                flips++;
            }
        }
        return flips;
    }
}
