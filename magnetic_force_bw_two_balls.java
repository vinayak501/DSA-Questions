package org.example;

import java.util.Arrays;

public class magnetic_force_bw_two_balls {
    static boolean possibleToPut(int midforce,int[] position,int m){
        int prev = position[0];
        int countBalls = 1;
        for (int i=1;i<position.length;i++){
            int curr = position[i];
            if (curr - prev >= midforce){
                countBalls++;
                prev = curr;
            }
            if (countBalls == m) break;
        }
        return countBalls  == m;
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int minForce = 1;
        int maxForce = position[n-1] - position[0];
        int result = 0;
        while (maxForce >= minForce){
            int midForce = minForce + (maxForce - minForce) / 2;
            if (possibleToPut(midForce,position,m)){
                minForce = midForce +1;
                result = midForce;
            }else {
                maxForce = midForce -1;
            }
        }
        return result;
    }
}
