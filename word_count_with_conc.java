package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class word_count_with_conc {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int wordCount = words.length;
        int wordLength = words[0].length();
        List<Integer> result = new ArrayList<>();
        for (String word:words) {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (int i=0;i<s.length() - (wordCount*wordLength);i++){
            Map<String,Integer> seen = new HashMap<>();
            for (int j=0;j<wordCount;j++){
                int nextIndexOfWord = i+j*wordLength;
                String nextWord = s.substring(nextIndexOfWord,nextIndexOfWord+wordLength);
                if(!map.containsKey(nextWord)) break;
                seen.put(nextWord,seen.getOrDefault(nextWord,0)+1);
                if (seen.get(nextWord)> map.getOrDefault(nextWord,0)) break;
                if (j+1==wordCount) result.add(i);
            }
        }
        return result;
    }
}
