package org.example;

import java.util.HashMap;

public class isomorphic_string {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();
        if(s.length() != t.length()) return false;
        int n = s.length();
        for (int i=0;i<n;i++){
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            if(map1.containsKey(s.charAt(i))){
                if (map1.get(char1) != char2) return false;
            }else {
                if (map2.containsKey(char2)) return false;
                else {
                    map1.put(char1,char2);
                    map2.put(char2,true);
                }
            }
        }
        return true;
    }
}
