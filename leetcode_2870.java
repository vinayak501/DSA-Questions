package org.example;

import java.util.HashMap;
import java.util.Map;

public class leetcode_2870 {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int c = entry.getValue();
            if(c==1) return -1;
            ans += Math.ceil((double)c/3);
        }
        return ans;
    }
}
