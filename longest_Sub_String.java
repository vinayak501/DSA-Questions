package org.example;

import java.util.HashSet;
import java.util.Set;

public class longest_Sub_String {
    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int right =0;
        Set<Character> seen = new HashSet();
        int max =0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(seen.add(c)){
                max = Math.max(max,right-left+1);
                right++;
            }else {
                while (s.charAt(left)!=c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s= "pwwkew";
        int a = lengthOfLongestSubstring(s);
        System.out.println(a);
    }
}
