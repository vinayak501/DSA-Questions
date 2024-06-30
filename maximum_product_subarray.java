package org.example;

public class maximum_product_subarray {
    //********************************************** Dynamic programming **************************************
//    public int solve(int ind,int[] nums){
//        if (ind >= nums.length - 1) return nums[nums.length-1];
//        int res = solve(ind+1,nums);
//        int max = Integer.MIN_VALUE;
//        int product = 1;
//        for (int j=ind;j<nums.length;j++){
//            product *= nums[j];
//            max = Math.max(max,product);
//        }
//        return Math.max(res,max);
//    }
//    public int maxProduct(int[] nums) {
//        return solve(nums.length-1,nums);
//    }


    //********************************************** KADANE's ALGO **************************************

    public int maxProduct(int[] nums) {
        int pre = 1;
        int post = 1;
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (pre == 0) pre =1;
            if (post == 0) post = 1;
            pre *= nums[i];
            post *= nums[n-i-1];
            ans = Math.max(pre,post);
        }
        return ans;
    }
}
