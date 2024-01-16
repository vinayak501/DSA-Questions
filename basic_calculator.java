package org.example;

import java.util.Stack;

public class basic_calculator {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                number = number * 10 + (currentChar - '0');
            } else if (currentChar == '+') {
                result += (number * sign);
                number = 0;
                sign = 1;
            } else if (currentChar == '-') {
                result += (number * sign);
                number = 0;
                sign = -1;
            } else if (currentChar == '(') {
                st.push(result);
                st.push(sign);
                result = 0;
                number = 0;
                sign = 1;
            } else if (currentChar == ')') {
                result += (number * sign);
                number = 0;

                int stackSign = st.pop();
                int lastResult = st.pop();

                result *= stackSign;
                result += lastResult;
            }
        }

        result += (number * sign);
        return result;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
