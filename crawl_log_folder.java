package org.example;

import java.util.Stack;

public class crawl_log_folder {
    public int minOperations(String[] logs) {
        Stack<Integer> st = new Stack<>();
        for(String s:logs){
            if (s.startsWith("../")){
                if (!st.isEmpty()){
                    st.pop();
                }
            }else if(s.startsWith("./")){
                continue;
            }else {
                st.push(1);
            }
        }
        return st.size();
    }
}
