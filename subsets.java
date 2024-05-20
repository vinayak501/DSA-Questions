package org.example;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> ans;
    public void solve(int[] nums,int i,List<Integer> temp){
        if (i > nums.length){
            ans.add(temp);
        }else {
            temp.add(nums[i]);
            solve(nums,i+1,temp);
            temp.remove(nums[i]);
            solve(nums,i+1,temp);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        solve(nums,0,temp);
        return ans;
    }
}
