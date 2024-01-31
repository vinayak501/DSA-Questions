package org.example;

import java.util.ArrayList;
import java.util.List;

public class pascal_triangle_2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        for (int i=1;i<=rowIndex ;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j=1;j<i;j++){
                currRow.add(prevRow.get(j) + prevRow.get(j-1));
            }
            currRow.add(1);
            result.add(currRow);
        }
        return result.get(rowIndex);
    }
}
