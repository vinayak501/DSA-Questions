package org.example;

public class sum_root_of_leaf {
    public int solve(TreeNode node,int curr){
        if (node.left == null && node.right == null){
            return (curr*10 + node.val);
        }
        int right = 0,left=0;
        if (node.right != null){
            right = solve(node.right,curr*10+node.val);
        }
        if (node.left != null){
            left = solve(node.left,curr*10+node.val);
        }

        return left+right;
    }
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }
}
