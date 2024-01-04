package org.example;

public class longest_palidrome_substring {
    public String longestPalindrome(String s) {
        int start= 0;
        int end= 0;
        for(int i=0;i<s.length();i++){
            int len1 = exapandFromMiddle(s,i,i+1);
            int len2 = exapandFromMiddle(s,i,i);
            int len = Math.max(len1,len2);
            if(end-start < s.length()){
                start = i - (len-1)/2;
                end = i + (len/2);
            }
        }
        return s.substring(start,end+1);
    }

    int exapandFromMiddle(String s , int i ,int j){
        while (i >= 0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;j++;
        }
        return j-i+1;
    }
}
