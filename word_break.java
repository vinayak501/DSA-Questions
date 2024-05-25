package org.example;

import java.util.List;

public class word_break {
    public Boolean[] t;
    public int n;
    public boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        t = new Boolean[s.length()];
        return solve(0,s,wordDict);
    }
    private boolean solve(int ind,String s,List<String> wordDict){
        if (ind == n) return true;
        if (t[ind] != null) return t[ind];
        for (int endInd = ind + 1;endInd<n;endInd++){
            String temp = s.substring(ind , endInd);
            if (wordDict.contains(temp) && solve(endInd,s,wordDict)) return t[ind] = true;
        }
        return t[ind] = false;
    }
}
