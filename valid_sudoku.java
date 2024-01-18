package org.example;

import java.util.HashSet;

public class valid_sudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> st = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                String row = Integer.toString(board[i][j]) + "_ROW_" + Integer.toString(i);
                String column = Integer.toString(board[i][j]) + "_COLUMN_" + Integer.toString(j);
                String box = Integer.toString(board[i][j]) + "_BOX_" + Integer.toString(i/3)+"_"+Integer.toString(j/3);
                if(st.contains(row) || st.contains(column) || st.contains(box)) return false;
                st.add(row);
                st.add(column);
                st.add(box);
            }
        }
        return true;
    }
}
