package org.example;

public class sum_of_xor {
    public int subsetXORSum(int[] nums) {
        //the brute force will be getting all subsets by recursion and adding their xor to result
        int n = nums.length;
        int res = 0;
        for (int num: nums){
            res |= num;
        }
        return res << (n-1);
    }
}
