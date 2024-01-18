package org.example;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowstart = 0;
        int rowend = matrix.length - 1;
        int columnstart = 0;
        int columnend = matrix[0].length - 1;

        while (rowstart <= rowend && columnstart <= columnend) {
            for (int i = columnstart; i <= columnend; i++) {
                res.add(matrix[rowstart][i]);
            }
            rowstart++;

            for (int i = rowstart; i <= rowend; i++) {
                res.add(matrix[i][columnend]);
            }
            columnend--;

            if (rowstart <= rowend) {
                for (int i = columnend; i >= columnstart; i--) {
                    res.add(matrix[rowend][i]);
                }
                rowend--;
            }

            if (columnstart <= columnend) {
                for (int i = rowend; i >= rowstart; i--) {
                    res.add(matrix[i][columnstart]);
                }
                columnstart++;
            }
        }

        return res;
    }
}
