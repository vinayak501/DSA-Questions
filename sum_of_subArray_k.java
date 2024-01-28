package org.example;

import java.util.HashMap;
import java.util.Map;

public class sum_of_subArray_k {
    public int subarraySum(int[] nums, int k) {
        int result =0;
        int sum =0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(mp.containsKey(sum-k)){
                result += mp.get(sum-k);
            }
            mp.put(sum ,mp.getOrDefault(sum,0)+1);
        }
        return result;
    }
}
