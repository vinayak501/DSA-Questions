package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class word_break_2 {
    private List<String> res;
    private Set<String> words;
    public void solve(int i,String currSentence,String s){

        if (i >= s.length()){
            res.add(currSentence.trim());
            return;
        }
        for (int j=i;j<s.length();j++){
            String temp = s.substring(i,j+1);
            if (words.contains(temp)){
                String originalSentence = currSentence;
                if (!currSentence.isEmpty()){
                    currSentence += " ";
                }
                currSentence += temp;
                solve(j+1,currSentence,s);
                currSentence = originalSentence;
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        res = new ArrayList<>();
        words = new HashSet<>(wordDict);
        String currSentence = "";
        solve(0,currSentence,s);
        return res;
    }
}
