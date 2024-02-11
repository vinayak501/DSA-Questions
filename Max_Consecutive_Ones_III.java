package org.example;

public class Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int count =0;
        int i =0;
        int ans = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            if (nums[j] == 0) {
                count++;
            }

            while (count > k) {
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
