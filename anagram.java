package org.example;

import java.util.ArrayList;
import java.util.List;

public class anagram {
    static boolean isAnagram(String s, String t) {
        List<Character> have = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            have.add(s.charAt(i));
        }
        for (int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(have.contains(c)){
                have.remove(Character.valueOf(c));
            }else {
                return false;
            }
        }
        return have.isEmpty();
    }

    public static void main(String[] args) {
        String s ="anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
