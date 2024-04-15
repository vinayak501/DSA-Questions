package org.example;

import com.sun.source.tree.Tree;

public class sum_of_left_leaf_BT {
    public int solve(TreeNode curr,TreeNode parent){
        if (curr == null) return 0;
        int left = solve(curr.left,curr);
        int right = solve(curr.right,curr);

        int sum =0;
        if (curr.left == null && curr.right == null){
            if (parent != null && parent.left == curr){
                sum += curr.val;
            }
        }
        return left + right + sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return solve(root,null);
    }
}
