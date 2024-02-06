package org.example;

import java.util.ArrayList;
import java.util.List;

public class kids_with_highest_candy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int i:candies) {
            max=Math.max(max,i);
        }
        for (int i: candies) {
            if (i+extraCandies >= max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}
