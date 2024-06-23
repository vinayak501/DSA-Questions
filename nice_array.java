package org.example;

public class nice_array {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int oddCount = 0;
        int res = 0;
        int i=0;
        int j=0;
        while (j < n){
            if (nums[j] % 2 != 0){
                oddCount++;
                count = 0;
            }

            while (oddCount == k){
                count++;

                if (i < n && nums[i] % 2 == 1){
                    oddCount--;
                }
                i++;
            }
            res += count;
            j++;
        }
        return res;
    }
}
