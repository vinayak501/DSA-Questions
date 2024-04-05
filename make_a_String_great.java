package org.example;

import java.util.Stack;

public class make_a_String_great {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (!st.isEmpty() && Math.abs(c - st.peek()) == 32){
                st.pop();
            }else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}
