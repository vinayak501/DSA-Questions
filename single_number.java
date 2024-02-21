package org.example;

public class single_number {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums){
            ans = ans ^ i;
        }
        return ans;
    }
}
