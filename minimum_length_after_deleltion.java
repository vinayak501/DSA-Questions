package org.example;

public class minimum_length_after_deleltion {
    public int minimumLength(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        char ch;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            ch = s.charAt(i);
            while (i < j && s.charAt(i) == ch) {
                i++;
            }
            while (j >= i && s.charAt(j) == ch) {
                j--;
            }
        }
        return j - i + 1;
    }
}
