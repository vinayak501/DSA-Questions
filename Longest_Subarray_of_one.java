package org.example;

public class Longest_Subarray_of_one {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i =0,j=0;
        int count = 0;
        int ans = Integer.MIN_VALUE;
        while (j<n){
            if (nums[j] == 0) count++;
            while (count > 1){
                if (nums[i] == 0) count--;
                i++;
            }
            ans = Math.max(ans,j-i);
            j++;
        }
        return ans;
    }
}
