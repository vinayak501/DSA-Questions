package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class daily_temp {
    static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st =new Stack<>();
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) res[i] =0;
            else res[i] = st.peek() - i;
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] inp = {73,74,75,71,69,72,76,73};
        int[] res = dailyTemperatures(inp);
        for (int i:
             res) {
            System.out.println(i);
        }
    }
}
