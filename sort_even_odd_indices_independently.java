package org.example;

public class sort_even_odd_indices_independently {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        for (int i =1;i<n;i+=2){
            if(nums[i] > nums[i+2]){
                int temp = nums[i];
                nums[i] = nums[i+2];
                nums[i+2] = temp;
            }
        }
        for (int i =0;i<n;i+=2){
            if(nums[i] < nums[i+2]){
                int temp = nums[i];
                nums[i] = nums[i+2];
                nums[i+2] = temp;
            }
        }
        return nums;
    }
}
