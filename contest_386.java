package org.example;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class contest_386 {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
            if (map.get(i) > 2) return false;
        }
        return true;
    }




    public int solve(int i ,int j , int[] nums,int[] changeIndices){
        int n = nums.length;
        int m = changeIndices.length;
        if (j == m) return 0;

        int mark = Integer.MAX_VALUE;
        if (nums[i] == 0 && changeIndices[j] == i){
            for (int x=0;x<n;x++){
                mark = Math.min(mark,1 + solve(x,j+1,nums,changeIndices));
            }
        }
        nums[i] = nums[i] - 1;
        int decreament = Integer.MAX_VALUE;
        for (int x=0;x<n;x++){
            decreament = Math.min(decreament,1 + solve(x,j+1,nums,changeIndices));
        }
        int doNothing =Integer.MAX_VALUE;
        for (int x=0;x<n;x++){
            doNothing = Math.min(doNothing,1 +  solve(x,j+1,nums,changeIndices));
        }

        return Math.min(mark,Math.min(decreament,doNothing));
    }
    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        return solve(0,1,nums,changeIndices);
    }
}
