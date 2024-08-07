package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class N_queens {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        dfs(0,board,ans);
        return ans;
    }

    public static boolean validate(char[][] board, int row, int col){
        int duprow = row;
        int dulcol = col;
        while (row >= 0 && col >= 0){
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dulcol;

        while (col >= 0){
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dulcol;

        while (col >=0 && row < board.length){
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }

    static void dfs(int col,char[][] board,List<List<String>> ans){
        if (board.length == col){
            ans.add(construct(board));
            return;
        }

        for (int row=0;row<board.length;row++){
            if (validate(board,row,col)){
                board[row][col] = 'Q';
                dfs(col+1,board,ans);
                board[row][col] = '.';
            }
        }
    }


    static List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for (int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
