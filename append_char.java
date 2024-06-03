package org.example;

public class append_char {
    public int appendCharacters(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i=0,j=0;
        while (i < m && j < n){
            char first = s.charAt(i);
            char second = t.charAt(j);
            if(first == second){
                i++;
                j++;
            }else {
                i++;
            }
        }
        return n-j;
    }
}
