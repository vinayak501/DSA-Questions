package org.example;

import java.util.ArrayList;
import java.util.List;

public class Build_an_Array_With_Stack_Operations {
    public List<String> buildArray(int[] target, int n) {
        int i = 0;
        int j = 1;
        List<String> result = new ArrayList<>();
        while (i < target.length && j <= n){
            if (target[i] == j){
                result.add("Push");
                i++;
                j++;
            } else{
                result.add("Push");
                result.add("Pop");
                j++;
            }
        }
        return result;
    }
}
