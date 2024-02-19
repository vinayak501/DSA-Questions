package org.example;

public class diameter_BT {
    public int Max_diameter(TreeNode root,int[] diameter){
        if (root==null) return 0;
        int lh = Max_diameter(root.left,diameter);
        int rh = Max_diameter(root.right,diameter);
        diameter[0] = Math.max(diameter[0] , lh+rh);
        return 1+Math.max(rh,lh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        Max_diameter(root,diameter);
        return diameter[0];
    }
}
