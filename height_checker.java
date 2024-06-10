package org.example;

import java.util.Arrays;

public class height_checker {
    public int heightChecker(int[] heights) {
        int[] save = heights.clone();
        Arrays.sort(heights);
        int result = 0;
        for (int i=0;i<heights.length;i++){
            if (heights[i] != save[i]) result++;
        }
        return result;
    }
}
