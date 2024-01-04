package org.example;

import java.util.HashMap;

public class happy_number {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        boolean flag = true;
        while (flag){
            String number = Integer.toString(n);
            char [] digits = number.toCharArray();
            int answer=0;
            for (int digit:digits) {
                int digitValue = Character.getNumericValue(digit);
                answer+= digitValue*digitValue;
            }
            if(answer==1) flag = false;
            if(seen.containsKey(answer)) return false;
            seen.put(answer,seen.getOrDefault(answer,0)+1);
            n = answer;
        }
        return true;
    }
}
