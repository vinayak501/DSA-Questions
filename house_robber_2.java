package org.example;

import java.util.ArrayList;
import java.util.List;

public class house_robber_2 {
    public int roblikelinear(List<Integer> nums) {
        int n=nums.size();
        int prev = nums.get(0);
        int prev2 = 0;
        for (int i=1;i<n;i++){
            int take = nums.get(i);
            if(i>1) take+= prev2;
            int notake = 0+prev;
            int curr = Math.max(take,notake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public int rob(int[] nums){
        int n = nums.length;
        List<Integer> Wfirst = new ArrayList<>();
        List<Integer> Wlast = new ArrayList<>();
        for (int i=0;i<n;i++){
            if(i != 0) Wfirst.add(nums[i]);
            if(i != n-1) Wlast.add(nums[i]);
        }
        int first = roblikelinear(Wfirst);
        int second = roblikelinear(Wlast);
        return Math.max(first,second);
    }
}
