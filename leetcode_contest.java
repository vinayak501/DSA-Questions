package org.example;

public class leetcode_contest {
    public int check(int num1,int num2){
        String num1s = Integer.toString(num1);
        String num2s = Integer.toString(num2);
        int n = num1s.length();
        int m = num2s.length();
        int i=0,j=0;
        while (i < n){
            if (num1s.charAt(i) == num2s.charAt(j)){
                i++;
                j++;
            }else {
                return i;
            }
        }
        return i;
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int len = check(arr1[i],arr2[j]);
                ans = Math.max(ans,len);
            }
        }
        return ans;

    }
}
