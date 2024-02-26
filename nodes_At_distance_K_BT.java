package org.example;

import java.util.*;

public class nodes_At_distance_K_BT {
    private void markParent(TreeNode root, Map<TreeNode,TreeNode> parent_track,TreeNode target){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode curr = q.poll();
            if (curr.left != null){
                parent_track.put(curr.left,curr);
                q.offer(curr.left);
            }
            if (curr.right != null){
                parent_track.put(curr.right,curr);
                q.offer(curr.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent_track = new HashMap<>();
        markParent(root,parent_track,root);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target,true);
        int curr_level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            if (curr_level == k) break;
            curr_level++;
            for (int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if (curr.left != null && visited.get(curr.left) == null){
                    queue.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if (curr.right != null && visited.get(curr.right) == null){
                    queue.offer(curr.right);
                    visited.put(curr.right,true);
                }
                if (parent_track.get(curr) != null && visited.get(parent_track.get(curr)) == null){
                    queue.offer(parent_track.get(curr));
                    visited.put(parent_track.get(curr) , true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();
            ans.add(curr.val);
        }
        return ans;
    }
}
