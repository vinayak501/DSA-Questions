package org.example;

import java.util.HashMap;

public class word_pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        int n = pattern.length();
        String[] words = s.split("\\+s");
        if(pattern.length() != words.length) return false;
        for (int i =0;i<n;i++){
            char current = pattern.charAt(i);
            String cuurentword = words[i];
            if (map.containsKey(current)){
                if (!map.get(current).equals(cuurentword)) return false;
            }else {
                map.put(current , cuurentword);
            }
        }
        return true;
    }
}
