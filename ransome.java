package org.example;

import java.util.HashMap;

public class ransome {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> stock = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            if(!stock.containsKey(c)){
                stock.put(c , 1);
            }else {
                stock.put(c,stock.get(c)+1);
            }
        }
        for (int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if (stock.containsKey(c) && stock.get(c) >0){
                stock.put(c,stock.get(c)-1);
            }else {
                return false;
            }
        }
        return true;

    }
}
