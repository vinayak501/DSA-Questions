package org.example;

import java.util.*;

public class group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupanagram = new HashMap<>();
        for(String str : strs){
            char[] current = str.toCharArray();
            Arrays.sort(current);
            String currentS = String.valueOf(current);
            if(!groupanagram.containsKey(currentS)){
                groupanagram.put(currentS , new ArrayList<>());
            }
            groupanagram.get(currentS).add(str);
        }
        return new ArrayList<>(groupanagram.values());
    }
}
