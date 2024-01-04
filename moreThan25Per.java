package org.example;

import java.util.HashMap;
import java.util.Map;

public class moreThan25Per {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length/4;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i : arr){
            res.put(i,res.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> e : res.entrySet() ){
            if(e.getValue() > n) {
                return e.getKey();
            }
        }
        return 0;
    }
}
