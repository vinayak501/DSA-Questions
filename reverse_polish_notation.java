package org.example;

import java.util.Stack;

public class reverse_polish_notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> save = new Stack<>();
        for (String t : tokens){
            if("+-*/".contains(t)) save.push(eval(save.pop(),save.pop(),t));
            else save.push(Integer.parseInt(t));
        }
        return save.pop();
    }
    public int eval(int b,int a,String op){
        if("+".equals(op)) return a+b;
        else if("-".equals(op)) return a -b;
        else if("*".equals(op)) return a*b;
        else return a/b;
    }
}
