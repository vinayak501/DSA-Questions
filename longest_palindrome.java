package org.example;

import java.util.Arrays;

public class longest_palindrome {
    public static int longestPalindrome(String s) {
        int[] count = new int[27];
        int ans = 0;
        Arrays.fill(count,0);
        for (char c : s.toCharArray()){
            count[(int) c - 97]++;
            if(count[(int) c - 97] % 2 == 0){
                ans+=2;
            }
        }
        for (int a : count){
            if (a % 2 != 0){
                ans++;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "bb";
        int a = longestPalindrome(s);
        System.out.println(a);
    }
}
