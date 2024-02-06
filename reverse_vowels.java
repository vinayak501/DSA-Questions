package org.example;

public class reverse_vowels {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        while (end > start){
            if (start < end && vowels.indexOf(word[start]) == -1) start++;
            if (start < end && vowels.indexOf(word[end]) == -1) end--;
            else {
                char temp = word[start];
                word[start] = word[end];
                word[end] =temp;
                start++;
                end--;
            }
        }
        return new String(word);
    }
}
