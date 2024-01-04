package org.example;

public class remove_duplicates {
    public int removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = nums[1];
        int i=0;
        for (int n : nums){
            if(i<2 || n != nums[i-2]) {
                res[i++] = nums[i];
            }
        }
        return i;
        }
    }

