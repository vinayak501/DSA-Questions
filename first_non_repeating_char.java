package org.example;

public class first_non_repeating_char {
    public int firstUniqChar(String s) {
        int n = s.length();
        int i = 0;
        while (i<n){
            int j=i+1;
            while (j<n){
                if (s.charAt(i) == s.charAt(j)){
                    i++;
                }
                j++;
            }
            if(j == n-1) return i;
        }
        return -1;
    }
}
