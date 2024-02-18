package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        if (root == null) return finalAns;
        q.add(root);
        while (!q.isEmpty()){
            int levels = q.size();
            List<Integer> subLevel = new ArrayList<>();
            for (int i=0;i<levels;i++){
                if (q.peek().left != null){
                    q.add(q.peek().left);
                }
                if (q.peek().right != null){
                    q.add(q.peek().right);
                }
                subLevel.add(q.remove().val);
            }
            finalAns.add(subLevel);
        }
        return finalAns;
    }
}
