package org.example;

public class transpose_matrix {
    public int[][] transpose(int[][] matrix) {
        int columns = matrix.length;
        int rows = matrix[0].length;

        int [][] new_matrix = new int[columns][rows];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                new_matrix[j][i] = matrix[i][j];
            }
        }
        return new_matrix;

    }
}
