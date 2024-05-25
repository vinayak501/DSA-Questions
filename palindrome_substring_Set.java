package org.example;

import java.util.ArrayList;
import java.util.List;

public class palindrome_substring_Set {
    private boolean isPalindrome(String s,int l,int r){
        while (r>l){
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    private void backtrack(String s,int idx,List<String> curr,List<List<String>> res){
        int n = s.length();
        if (idx >= n){
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i=idx;i<n;i++){
            if (isPalindrome(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                backtrack(s,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        backtrack(s,0,curr,result);

        return result;
    }
}
