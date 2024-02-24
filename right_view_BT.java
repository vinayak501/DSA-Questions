package org.example;

import java.util.ArrayList;
import java.util.List;

public class right_view_BT {
    public void solve(TreeNode curr,List<Integer> res,int currDepth){
        if (curr == null) return;
        if (currDepth == res.size()){
            res.add(curr.val);
        }
        solve(curr.right,res,currDepth+1);
        solve(curr.left,res,currDepth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        solve(root,res,0);
        return res;
    }
}
