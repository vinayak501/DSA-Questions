package org.example;

import java.util.HashMap;
import java.util.Map;

public class subarray_total_devided_by_k {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> save = new HashMap<>();
        int result = 0;
        int sum = 0;
        save.put(0,1);
        for (int i=0;i<n;i++){
            sum += nums[i];
            int reminder = sum % k;
            if(reminder < 0) reminder+= k;
            if (save.containsKey(reminder)){
                result += save.get(reminder);
            }
            save.put(reminder,save.getOrDefault(reminder,0)+1);
        }
        return result;
    }
}
