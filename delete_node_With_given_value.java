package org.example;

public class delete_node_With_given_value {
    public TreeNode deleteNode(TreeNode root,int target){
        if (root == null ) return null;
        root.right = deleteNode(root.right,target);
        root.left = deleteNode(root.left,target);

        if (root.right == null && root.left == null && root.val == target){
            return null;
        }
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return deleteNode(root,target);
    }
}
