package org.example;

public class Rotate_image {
    static void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] cloneM = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                cloneM[i][j] = matrix[i][j];
            }
        }
        for (int i=row-1;i>=0;i--){
            for (int j=0;j<column;j++){
                matrix[j][i] = cloneM[column-i-1][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
