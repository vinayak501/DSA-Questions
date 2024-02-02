package org.example;

import java.util.ArrayList;
import java.util.List;

public class sequintial_digits {
    public List<Integer> sequentialDigits(int low, int high) {
        String ans = "123456789";
        List<Integer> res = new ArrayList<>();
        int nl = String.valueOf(low).length();
        int nh = String.valueOf(high).length();
        for (int i=nl;i<=nh;i++){
            for (int j=0;j<10-i;j++){
                int num = Integer.parseInt(ans.substring(j,j+i));
                if (num >= low && num <= high) res.add(num);
            }
        }
        return res;
    }
}
