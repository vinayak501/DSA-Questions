package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class replace_with_root {
    public String findRoot(String word, Set<String> st){
        for (int i=1;i<= word.length();i++){
            String temp = word.substring(0,i);
            if (st.contains(temp)) return temp;
        }
        return word;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> st = new HashSet<>(dictionary);
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words){
            result.append(findRoot(word,st)+" ");
        }
        return result.toString().trim();
    }
}
