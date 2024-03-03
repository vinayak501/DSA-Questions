package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class left_most_element_BT {
    public int findBottomLeftValue(TreeNode root) {
        TreeNode leftmost = null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            leftmost = q.poll();
            if(leftmost.right!=null){
                q.offer(leftmost.right);
            }
            if(leftmost.left != null){
                q.offer(leftmost.left);
            }
        }
        return leftmost.val;
    }
}
