package org.example;

public class good_nodes_BT {
    public int ans;
    public void solve(TreeNode root,int val){
        if (root == null) return;
        if (root.val >= val) {
            ans++;
            val = root.val;
        }
        solve(root.left,val);
        solve(root.right,val);

    }
    public int goodNodes(TreeNode root) {
        ans = 0;
        solve(root,root.val);
        return ans;
    }
}
