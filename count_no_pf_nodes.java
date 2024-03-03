package org.example;

import com.sun.source.tree.Tree;

public class count_no_pf_nodes {
    public int righthight(TreeNode root){
        int count =0;
        while (root.right != null){
            count++;
            root = root.right;
        }
        return count;
    }
    public int leftheight(TreeNode root){
        int count =0;
        while (root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }
    public int countNodes(TreeNode root) {
        int left = leftheight(root);
        int right = righthight(root);
        if (left == right) return (2<<left - 1);
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
