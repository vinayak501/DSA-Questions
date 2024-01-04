package org.example;

public class reverse_word_String {
    public String reverseWords(String s) {
        String [] n = s.trim().split("\\s+");
        String answer = "";
        for (int i=n.length;i>0;i--){
            answer += n[i] + " ";
        }
        return answer+n[0];
    }
}
