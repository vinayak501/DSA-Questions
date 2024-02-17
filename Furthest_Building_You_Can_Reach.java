package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Furthest_Building_You_Can_Reach {
    public static int solve(int ind, int[] heights, int bricks, int ladders,int[][][] dp){
        int n = heights.length;
        if (ind == n-1) return 0;
        if (dp[ind][bricks][ladders] != -1) return dp[ind][bricks][ladders];
        if (bricks < heights[ind+1] - heights[ind] && ladders == 0) return 0;
        int ans = Integer.MIN_VALUE;
        if (heights[ind] >= heights[ind+1]){
            return dp[ind][bricks][ladders] = 1+solve(ind+1,heights,bricks,ladders,dp);
        }else {
            ans = ladders > 0 ? 1+solve(ind+1,heights,bricks,ladders-1,dp) : 0;
            if (bricks >= heights[ind+1] - heights[ind]){
                ans = Math.max(ans ,1+ solve(ind+1,heights,bricks - (heights[ind+1] - heights[ind]),ladders,dp));
            }
        }
        return dp[ind][bricks][ladders] = ans;
    }
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        int [][][] dp = new int[n+1][bricks+1][ladders+1];
        for (int[][] rows : dp){
            for (int[] i :rows){
                Arrays.fill(i,-1);
            }
        }
        return solve(0,heights,bricks,ladders,dp);
    }

    // *********************************** TABULATION ************************************************************

    public int furthestBuilding_tab(int[] heights, int bricks, int ladders){
        int n = heights.length;
        int[][][] dp = new int[n][bricks + 1][ladders + 1];

        // Initialize the dp table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= bricks; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        // Base case: when ind reaches n-1
        for (int i=0;i<=bricks;i++){
            for (int j=0;j<=ladders;j++){
                dp[n-1][i][j] = 0;
            }
        }

        // Loop through the dp table
        for (int ind = n-2; ind >= 0; ind--) {
            for (int b = 0; b <= bricks; b++) {
                for (int l = 0; l <= ladders; l++) {
                    // Calculate the result for current state (ind, bricks, ladders)
                    int ans = Integer.MIN_VALUE;
                    if (heights[ind] >= heights[ind+1]) {
                        ans = 1 + dp[ind+1][b][l];
                    } else {
                        if (l > 0) {
                            ans = 1 + dp[ind+1][b][l-1];
                        }
                        if (b >= heights[ind+1] - heights[ind]) {
                            ans = Math.max(ans, 1 + dp[ind+1][b - (heights[ind+1] - heights[ind])][l]);
                        }
                    }
                    // Store the result in dp table
                    dp[ind][b][l] = ans >= 0 ? ans : 0;
                }
            }
        }

        // Return the result for the initial state (0, bricks, ladders)
        return dp[0][bricks][ladders];
    }


    //********************************************* LAZY GREEDY *************************************************

    public int furthestBuilding_lazy_greedy(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] >= heights[i + 1]) continue;
            bricks -= heights[i + 1] - heights[i];
            pq.add(heights[i + 1] - heights[i]);

            if (bricks < 0) {
                bricks += pq.poll();
                if (ladders > 0) ladders--;
                else return i;
            }
        }

        return heights.length - 1;
    }

    public static void main(String[] args) {
        int[] heights = {4,2,7,6,9,14,15};
        int ans = furthestBuilding(heights,5,1);
    }
}
