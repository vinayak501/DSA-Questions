package org.example;

public class palindrome_string {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z]", "");
        String last = result.toLowerCase();
        StringBuilder a = new StringBuilder();
        a.append(last);
        return a.reverse().toString().equals(last);
    }
}
