package org.example;

import java.util.HashMap;
import java.util.StringJoiner;

public class contest_126 {
    public String minimizeStringValue(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for (Character i : s.toCharArray()){
            if (i == '?') continue;
            mp.put(i,mp.getOrDefault(i,-1)+1);
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == '?'){
                int a = 97;
                while (a <= 122){
                    char c = (char)a;
                    if (mp.get(c) == null){
                        sb.replace(i,i+1, String.valueOf(c));
                    }else{
                        a++;
                    }
                }
                sb.replace(i,i+1,"a");
            }
        }
        return sb.toString();
    }
}
