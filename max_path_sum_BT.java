package org.example;

public class max_path_sum_BT {
    private int max;
    public int maxSum (TreeNode root){
        if (root == null) return 0;
        int leftSum = Math.max(0,maxSum(root.left));
        int rightSum =Math.max(0,maxSum(root.right));
        max = Math.max(max,root.val + rightSum + leftSum);
        return root.val + Math.max(leftSum,rightSum);
    }
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        maxSum(root);
        return max;
    }
}
