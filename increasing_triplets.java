package org.example;

public class increasing_triplets {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i<=n-3){
            if (nums[i] < nums[i+1]) {
                if (nums[i+1] < nums[i+2]) return true;
             }
            i++;
        }
        return false;
    }
}
