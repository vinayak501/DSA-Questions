package org.example;

public class Diff_matrix {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int [][] res = new int[rows][columns];
        int []oneRow = new int[rows];
        int []oneColumn = new int[columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                oneRow[i] += grid[i][j]==1?1:0;
                oneColumn[j] += grid[i][j]==1?1:0;
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                res[i][j] = oneRow[i] + oneColumn[j] - (rows - oneRow[i]) - (columns - oneColumn[j]);
            }
        }
        return res;

    }
}
