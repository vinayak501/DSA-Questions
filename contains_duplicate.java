package org.example;

public class contains_duplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j) break;
                if(nums[i] == nums[j]){
                    if (Math.abs(i-j)<=k) return true;
                }
            }
        }
        return false;
    }
}
