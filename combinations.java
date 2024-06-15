package org.example;

import java.util.ArrayList;
import java.util.List;

public class combinations {
    List<List<Integer>> result;
    public void solve(int curr,int n,int k,List<Integer> temp){
        if (k == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if (curr > n) return;
        temp.add(curr);
        solve(curr+1,n,k-1,temp);
        temp.remove(curr);
        solve(curr+1,n,k,temp);
    }
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(1,n,k,temp);
        return result;
    }
}
