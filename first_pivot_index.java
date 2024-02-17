package org.example;

public class first_pivot_index {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            int right = 0;
            int left = 0;
            for (int x=0;x<i;x++){
                left += nums[x];
            }
            for (int x=i+1;x<n;x++){
                right += nums[x];
            }
            if (left == right) return i;
        }
        return -1;
    }
}
