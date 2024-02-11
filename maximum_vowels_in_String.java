package org.example;

public class maximum_vowels_in_String {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int maxV = 0;
        int i=0,j=0;
        while (j<n){
            if (isVowel(s.charAt(j))) count++;
            if (j-i+1 == k){
                maxV = Math.max(maxV,count);
                if (isVowel(s.charAt(i))) count--;
                i++;
            }
            j++;
        }
        return maxV;
    }
}
