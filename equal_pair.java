package org.example;

import java.util.HashMap;
import java.util.Map;

public class equal_pair {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        int count = 0;

        Map<String, Integer> mp = new HashMap<>();

        // 1
        for (int row = 0; row < n; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < grid[row].length; col++) {
                sb.append(grid[row][col]);
                if (col < grid[row].length - 1) {
                    sb.append(",");
                }
            }
            String key = sb.toString();
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }

        // 2
        for (int c = 0; c < n; c++) {
            StringBuilder sb = new StringBuilder();
            for (int r = 0; r < n; r++) {
                sb.append(grid[r][c]);
                if (r < n - 1) {
                    sb.append(",");
                }
            }
            String key = sb.toString();
            count += mp.getOrDefault(key, 0);
        }

        return count;
    }
}
