package org.example;

public class rain_water_trapping {
    public int trap(int[] height) {
        int n = height.length;
        int [] right = new int[n];
        int [] left = new int[n];
        left[0] = height[0];
        for (int i=1;i<n;i++){
            left[i] = Math.max(height[i] , left[i-1]);
        }
        right[n-1] = height[n-1];
        for (int i = n-2;i>=0;i--){
            right[i] = Math.max(height[i] , right[i+1]);
        }
        int answer = 0;
        for (int i=0;i<n;i++){
            answer += (Math.min(right[i] , left[i]) - height[i]);
        }
        return answer;
    }
}
