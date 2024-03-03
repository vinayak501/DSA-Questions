package org.example;

public class LEECODE_BIWIKLI {
    public long check(int[] nums){
        long ans = 0;
        for (int i=0;i<nums.length;i++){
            ans += nums[i];
        }
        return ans;
    }
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long ans = check(nums);
        for (int[] edge : edges){
            int from = edge[0];
            int to = edge[1];
            int a = nums[from];
            int b = nums[to];
            nums[from] = nums[from]^k;
            nums[to] = nums[to]^k;
            if (check(nums) > ans){
                ans = check(nums);
            }else {
                nums[from] = a ;
                nums[to] = b;
            }
        }
        return ans;
    }
}
