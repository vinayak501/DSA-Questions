package org.example;

public class water_tank {
    public int maxArea(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while (r > l){
            max =Math.max ((r-l)*Math.min(height[l],height[r]),max);
            if (height[r] > height[l]) l++;
            else r--;
        }
        return max;
    }
}
