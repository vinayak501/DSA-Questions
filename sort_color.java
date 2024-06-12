package org.example;

public class sort_color {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i=0,j=0,k=n-1;
        while (k >= j){
            if (nums[j] == 1){
                j++;
            }else if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
    }
}
