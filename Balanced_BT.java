package org.example;

public class Balanced_BT {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        if (lh == -1) return -1;
        int rh = maxDepth(root.right);
        if (rh == -1) return -1;
        if (Math.abs(rh-lh) > 1) return -1;
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
}
