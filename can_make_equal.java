package org.example;

public class can_make_equal {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String word:words) {
            for (char c:word.toCharArray()) {
                count[c - 'a']++;
            }
        }
        for (int i:count){
            if(!(i%count.length==0)){
                return false;
            }
        }
        return true;
    }
}
