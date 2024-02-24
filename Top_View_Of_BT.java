package org.example;
import java.util.*;

class Pair{
    TreeNode node;
    int vertical;
    public Pair(TreeNode n, int v){
        node=n;
        vertical=v;
    }
}
public class Top_View_Of_BT {
    public ArrayList<Integer> Topview(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.vertical;
            TreeNode temp = it.node;
            if (map.get(hd) == null){
                map.put(hd,temp.val);
            }
            if (temp.left != null){
                q.add(new Pair(temp.left,hd-1));
            }
            if (temp.right != null){
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
