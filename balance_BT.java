package org.example;

import com.sun.source.tree.Tree;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class balance_BT {
    public void inOrder(TreeNode root, List<Integer> vec){
        if(root == null) return;
        inOrder(root.left,vec);
        vec.add(root.val);
        inOrder(root.right,vec);
    }
    public TreeNode construct(int l,int r,List<Integer> vec){
        if (l > r){
            return null;
        }
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(vec.get(mid));
        root.left = construct(l,mid-1,vec);
        root.right = construct(mid+1,r,vec);
        return root;
    }


    public TreeNode balanceBST(TreeNode root) {
        List<Integer> vec = new ArrayList<>();
        inOrder(root,vec);
        return construct(0,vec.size()-1,vec);
    }
}
