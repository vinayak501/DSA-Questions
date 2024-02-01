package org.example;

public class search_2D_matrix {
//    public boolean searchMatrix(int[][] matrix, int target) {
//            int row = 0;
//            int col = matrix[0].length-1;
//            while (row < matrix.length-1 && col>0){
//                if (matrix[row][col] == target) return true;
//                else if(matrix[row][col] < target) col--;
//                else row++;
//            }
//            return false;
//    }
    static boolean solve(int row,int col,int[][] matrix,int target){
        if(row >= matrix.length || col >= matrix[0].length || row<0 || col <0) return false;
        if(matrix[row][col] == target) return true;
        else if(matrix[row][col]  < target) return solve(row,col-1,matrix,target);
        else return solve(row-1,col,matrix,target);
    }
    public boolean searchMatrix(int[][] matrix, int target){
        return solve(0,matrix[0].length-1,matrix,target);
    }
}
