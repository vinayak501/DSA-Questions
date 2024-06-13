package org.example;

public class kadane_algo_maximum_subarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for (int num : nums){
            sum += num;
            result = Math.max(result,sum);
            if (sum < 0){
                sum = 0;
            }
        }
        return result;
    }
}
