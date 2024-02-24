package org.example;

import java.util.*;

public class Bottom_View_BT {
    public ArrayList<Integer> bottomView(TreeNode root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        root.hd = 0;                                  // we can use Pair class if we don't want to change TreeNode
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.val);
            if(temp.left != null) {
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if(temp.right != null) {
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
