package org.example;

import java.util.List;

public class alternating_binary {
    public int minOperations(String s) {
        int count =0;
        int c = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                c = c == '0'?'1':'0';
            }else {
                count++;
            }
        }
        return Math.min(count,s.length()-count);
    }
}
