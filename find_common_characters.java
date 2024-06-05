package org.example;

import java.util.ArrayList;
import java.util.List;

public class find_common_characters {
    public void fillCountArray(String word,int[] count){
        for (char ch : word.toCharArray()){
            count[ch - 'a']++;
        }
    }
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int[] temp = new int[26];
        fillCountArray(words[0],temp);

        for (int i=1;i<n;i++){
            int[] count = new int[26];
            fillCountArray(words[i],count);

            for (int j=0;j<26;j++){
                temp[j] = Math.min(temp[j],count[j]);
            }
        }

        for (int i=0;i<26;i++){
            if (temp[i] > 0){
                for (int j=0;j<temp[i];j++){
                    result.add(String.valueOf((char)(i+'a')));
                }
            }
        }
        return result;
    }
}
