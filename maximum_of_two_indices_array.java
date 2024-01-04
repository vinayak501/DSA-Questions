package org.example;

public class maximum_of_two_indices_array {
    public static int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    int currentProduct = (nums[i] - 1) * (nums[j] - 1);
                    if (currentProduct > max) {
                        max = currentProduct;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums = {1, 5, 4, 5};
        System.out.println(maxProduct(nums));
    }
}
