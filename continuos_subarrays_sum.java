package org.example;

import java.util.HashMap;
import java.util.Map;

public class continuos_subarrays_sum {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> save = new HashMap<>();
        int sum = 0;
        for (int i=0;i<n;i++){
            sum+= nums[i];
            int reminder = sum % k;
            if (save.containsKey(reminder) && i-save.get(reminder) >= 2) return true;
            else save.put(reminder,i);
        }
        return false;
    }
}
