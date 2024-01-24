package org.example;

public class palindromic_path {
    private int result = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] temp =new int[10];
        solve(root,temp);
        return result;
    }
    private void solve(TreeNode root,int[] temp){
        if(root != null){
            temp[root.val]++;

            if (root.left == null && root.right == null){
                int oddfrq = 0;
                for (int i=0;i<9;i++){
                    if(temp[i] % 2 != 0){
                        oddfrq++;
                    }
                }
                result+= oddfrq <= 1 ? 1 : 0;
            }
            solve(root.left,temp);
            solve(root.right,temp);

            temp[root.val]--;
        }
    }
}
