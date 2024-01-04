package org.example;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int val_sum =0;
        int res = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            val_sum += nums[i];
            while (val_sum>=target){
                res = Math.min(res,i+1 -left);
                val_sum = val_sum - nums[left];
                left++;
            }
        }
        return (res != Integer.MAX_VALUE) ? res :0;
    }
}
