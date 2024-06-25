package org.example;

public class sum_all_greater_element_BST {
    public void solve(TreeNode root,int[] ans){
        if(root == null) return;
        solve(root.right,ans);
        ans[0] += root.val;
        root.val = ans[0];
        solve(root.left,ans);
    }
    public TreeNode bstToGst(TreeNode root) {
        int[] ans = new int[1];
        solve(root,ans);
        return root;
    }
}
