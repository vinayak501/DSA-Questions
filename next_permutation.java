package org.example;

public class next_permutation {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums,int i,int j){
        while (j>i){
            swap(nums,i,j);
            j--;
            i++;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-1;
        for (;i>0;i--){
            if (nums[i] > nums[i-1]){
                break;
            }
        }
        if (i != 0){
            int index = i;
            for (int j=n-1;j>=i;j--){
                if (nums[j] > nums[i-1]){
                    index = j;
                    break;
                }
            }
            swap(nums,i-1,index);
        }
        reverse(nums,i,n-1);
    }
}
