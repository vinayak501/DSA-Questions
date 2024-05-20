package org.example;

import com.sun.source.tree.Tree;

public class distribute_candies_BT {
    public int solve(TreeNode root,int[] moves){
        if (root == null) return 0;
        int left = solve(root.left,moves);
        int right = solve(root.right,moves);

        moves[0] += Math.abs(left) + Math.abs(right);
        return left+right+root.val-1;
    }
    public int distributeCoins(TreeNode root) {
        int[] moves = new int[1];
        moves[0] = 0;
        return solve(root,moves);
    }
}
