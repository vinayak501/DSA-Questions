package org.example;

import java.util.HashSet;
import java.util.Set;

public class string_comparison {
    public static int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        Set<Character> res = new HashSet();
        int i=0;
        while(i<chars.length){
            if(res.contains(chars[i])){
                i++;
                continue;
            }
            int count =0;
            res.add(chars[i]);
            for (int j=0;j<chars.length;j++){
                if(chars[j] == chars[i]) {
                    count++;
                }
                res.add((char)count);
            }
            i++;
        }
        return res.size();
//        for (int i=0;i<chars.length;i++){
//            res.add(chars[i]);
//        }
//        return (res.size()*2);
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c'};
        int a= compress(chars);
        System.out.println(a);

    }
}

