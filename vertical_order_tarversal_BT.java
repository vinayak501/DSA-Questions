package org.example;

import java.util.*;

class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node,int _row,int _col){
        node = _node;
        row = _row;
        col = _col;
    }
}
public class vertical_order_tarversal_BT {
    public List<List<Integer>> VerticalOrderTraversal(TreeNode root){
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while (!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            if (!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).add(node.val);

            if (node.left != null) {
                q.add(new Tuple(node.left,x-1,y+1));
            }
            if (node.right != null) {
                q.add(new Tuple(node.right,x+1,y+1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();

        for (TreeMap<Integer,PriorityQueue<Integer>> ys : map.values()){
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> node : ys.values()){
                while (!node.isEmpty()){
                    ans.get(ans.size() -1).add(node.poll());
                }
            }
        }
        return ans;
    }
}
