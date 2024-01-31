package org.example;

import java.util.List;

public class house_robber {
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
}
