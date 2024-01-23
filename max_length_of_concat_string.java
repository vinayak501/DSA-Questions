package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class max_length_of_concat_string {
        public int maxLength(List<String> arr) {
            List<Integer> uniqueStrings = new ArrayList<>();
            for (String s:arr){
                    Set<Character> set = new HashSet<>();
                    for (char ch : s.toCharArray()){
                            set.add(ch);
                    }
                    if (set.size() != s.length()) continue;

                    int val =0;
                    for (char ch : s.toCharArray()){
                            val |= 1 << (ch-'a');
                    }
                    uniqueStrings.add(val);
            }
            int[] result = {0};
            dfs(0,0,result,uniqueStrings);
            return result[0];
        }
        private void dfs(int ind,int temp,int[] result,List<Integer> uniqueString){
                result[0] = Math.max(result[0],Integer.bitCount(temp));
                for (int i=ind;i<uniqueString.size();i++){
                        if((temp & uniqueString.get(i)) == 0){
                                dfs(i+1,temp | uniqueString.get(i),result,uniqueString);
                        }
                }
        }
}
