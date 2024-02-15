package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class longest_string_chain {
    static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
    public int longestStrChain(String[] words) {
        List<String> clone = new ArrayList<>(List.of(words));
        clone.sort(comp);
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxi = 0;
        for (int ind=0;ind<n;ind++){
            for (int prev=0;prev<ind;prev++){
                if (compare (clone.get(ind)  , clone.get(prev))){
                    dp[ind] =Math.max(1+dp[prev] , dp[ind]);
                }
            }
            if (dp[ind] > maxi) {
                maxi = dp[ind];
            }
        }
        return maxi;
    }
    public boolean compare(String s,String t){
        if (s.length() != t.length() + 1) {
            return false;
        }
        int i=0,j=0;
        while (i < s.length()){
            if (j < t.length() && s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }
        if (i == s.length() && j == t.length()){
            return true;
        }
        return false;
    }
}
