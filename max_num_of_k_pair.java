package org.example;

import java.util.Arrays;

public class max_num_of_k_pair {
    // ************************************* brute force **********************************************************

//    public int maxOperations(int[] nums, int k) {
//        int n = nums.length;
//        int count = 0;
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                if (nums[i] +nums[j] == k) {
//                    count++;
//                    nums[i] = Integer.MIN_VALUE;
//                    nums[j] = Integer.MIN_VALUE;
//                }
//            }
//        }
//        return count;
//    }


    public int maxOperations(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        Arrays.sort(nums);
        int count = 0;
        while (end > start) {
            int ans = nums[start] + nums[end];
            if (ans == k){
                count++;
                start++;
                end--;
            }else if(k > ans){
                end--;
            }else {
                start++;
            }
        }
        return count;
    }
}
