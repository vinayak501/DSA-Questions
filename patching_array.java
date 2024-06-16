package org.example;

public class patching_array {
    public int minPatches(int[] nums, int n) {
        int i=0;
        int patch = 0;
        int maxReach = 0;
        while (i < nums.length && maxReach < n){
            if (nums[i] <= maxReach+1){
                i++;
                maxReach += nums[i];
            }else {
                maxReach += maxReach + 1;
                patch++;
            }
        }
        return patch;
    }
}
