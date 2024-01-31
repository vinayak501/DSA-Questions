package org.example;

// public class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
//}

public class house_robber_3 {
    public int[] travel(TreeNode root){
        if(root==null) return new int[2];
        int[] leftnode = travel(root.left);
        int[] rightnode = travel(root.right);
        int[] option = new int[2];
        option[0] = root.val + leftnode[1] + rightnode[1];
        option[1] =  Math.max(leftnode[0],leftnode[1]) + Math.max(rightnode[0],leftnode[1]);
        return option;
    }
    public int rob(TreeNode root) {
        int ans[] = travel(root);
        return Math.max(ans[0],ans[1]);
    }
}
