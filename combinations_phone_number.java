package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class combinations_phone_number {
    List<String> ans;
    public void solve(int idx,String digit,StringBuilder temp,Map<Character,String> save){
        if (idx >= digit.length()){
            ans.add(temp.toString());
            return;
        }

        char ch = digit.charAt(idx);
        String str = save.get(ch);

        for (int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            solve(idx+1,digit,temp,save);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0){
            return new ArrayList<>();
        }
        ans = new ArrayList<>();
        Map<Character,String> save = new HashMap<>();
        save.put('2',"abc");
        save.put('3',"def");
        save.put('4',"ghi");
        save.put('5',"jkl");
        save.put('6',"mno");
        save.put('7',"pqrs");
        save.put('8',"tuv");
        save.put('9',"wxyz");

        StringBuilder temp = new StringBuilder();

        solve(0,digits,temp,save);
        return ans;
    }
}
