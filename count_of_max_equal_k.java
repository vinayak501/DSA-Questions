package org.example;

import java.util.Arrays;

public class count_of_max_equal_k {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int i=0,j=0;
        int n = nums.length;
        int countMax = 0;
        int ans = 0;
        while (j<n){
            if (nums[j] == max){
                countMax++;
            }
            while (countMax >= k){
                ans += n -j;
                if (nums[i] == max){
                    countMax--;
                }
                i++;
            }
            j++;
        }
        return ans;

    }
}
