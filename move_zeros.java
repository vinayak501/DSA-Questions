package org.example;

public class move_zeros {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n==1) return;
        int filled = 0;
        for (int i =0;i<nums.length;i++){
            if (nums[i] != 0) nums[filled++] = nums[i];
        }
        while (filled < n){
            nums[filled++] = 0;
        }
    }
}
