package org.example;

import java.util.Arrays;

public class reverse_array {
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        int []temp = nums.clone();
        for(int i =0;i<n;i++){
            int position = (i+k)%n;
            nums[position] = temp[i];
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}



//****************************************0 ms************************************************************

//class Solution {
//
//    public static void reverse(int nums[], int start, int end){
//        // While start index is less than end index
//        while(start < end){
//            // Swap elements at start and end indices
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            // Increment start index and decrement end index
//            start++;
//            end--;
//        }
//    }
//
//    public void rotate(int[] nums, int k) {
//        // Ensure k is within array bounds
//        k %= nums.length;
//        // Reverse entire array
//        reverse(nums, 0, nums.length - 1);
//        // Reverse first k elements
//        reverse(nums, 0, k - 1);
//        // Reverse remaining elements
//        reverse(nums, k, nums.length - 1);
//    }
//}
