package org.example;

public class String_value {
    public int scoreOfString(String s) {
        int result = 0;
        for(int i=0;i<s.length()-1;i++){
            result += Math.abs((int) s.charAt(i) - (int) s.charAt(i+1));
        }
        return result;
    }
}
