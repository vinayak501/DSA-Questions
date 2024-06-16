package org.example;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public List<List<Integer>> result;
    public int n;
    public void solve(int curr,List<Integer> temp,int[] candidates,int target){
        if (target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if (curr == n){
            if (target == 0){
                result.add(new ArrayList<>(temp));
                return;
            }
        }
        if (target >= candidates[curr]){
            temp.add(candidates[curr]);
            solve(curr,temp,candidates,target - candidates[curr]);
            temp.remove(temp.size() - 1);
        }
        solve(curr +1,temp ,candidates,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        n = candidates.length;
        result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0,temp,candidates,target);
        return result;
    }
}
