package org.example;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class Pair_w{
    TreeNode node;
    int num;
    Pair_w(TreeNode _node,int _num){
        node = _node;
        num = _num;
    }
 }
public class max_width_BT {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        Queue<Pair_w> q = new LinkedList<>();
        q.add(new Pair_w(root,0));
        while (!q.isEmpty()){
            int size = q.size();
            int min =  q.peek().num;
            int first = 0,last = 0;
            for (int i=0;i<size;i++){
                int curr = q.peek().num - min;
                TreeNode node = q.peek().node;
                q.poll();
                if (i==0) first = curr;
                if (i==size-1) last = curr;
                if (node.left != null){
                    q.add(new Pair_w(node.left,curr*2+1));
                }
                if (node.right != null){
                    q.add(new Pair_w(node.right,curr*2+2));
                }
            }
            ans = Math.max(ans,last-first +1);
        }
        return ans;
    }
}
