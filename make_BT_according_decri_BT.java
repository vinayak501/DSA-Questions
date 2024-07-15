package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class make_BT_according_decri_BT {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> mpp = new HashMap<>();
        HashSet<Integer> st = new HashSet<>();
        for (int[] description : descriptions){
            int parent = description[0];
            int child = description[1];
            boolean isLeft = description[2] == 1;
            mpp.putIfAbsent(parent , new TreeNode(parent));
            mpp.putIfAbsent(child , new TreeNode(child));
            if (isLeft){
                mpp.get(parent).left = mpp.get(child);
            }else {
                mpp.get(parent).right = mpp.get(child);
            }
            st.add(child);
        }
        for (int[] description : descriptions){
            int parent = description[0];
            if (!st.contains(parent)){
                return mpp.get(parent);
            }
        }
        return null;
    }
}
