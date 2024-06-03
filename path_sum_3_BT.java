package org.example;

public class path_sum_3_BT {
    public int helper(TreeNode root, int targetSum, long curSum){
        int count = 0;
        if(root == null) return 0;
        curSum += root.val;
        if(curSum == targetSum) count++;
        count += helper(root.left, targetSum, curSum);
        count += helper(root.right, targetSum, curSum);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        int count = 0;
        if(root == null) return 0;
        count += helper(root, targetSum, 0);
        count += pathSum(root.left, targetSum)+pathSum(root.right, targetSum);
        return count;
    }
}
