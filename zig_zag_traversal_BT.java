package org.example;

import java.util.*;

public class zig_zag_traversal_BT {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag = false;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalans = new ArrayList<>();
        if (root == null) return finalans;
        q.add(root);
        while (!q.isEmpty()){
            int levels = q.size();
            List<Integer> sublevel = new ArrayList<>();
            for (int i=0;i<levels;i++){
                if (q.peek().left != null) q.add(q.peek().left);
                if (q.peek().right != null) q.add(q.peek().right);
                sublevel.add(q.remove().val);
            }
            if (flag){
                Collections.reverse(sublevel);
            }
            flag = !flag;
            finalans.add(sublevel);
        }
        return finalans;
    }
}
