package org.example;

import java.util.Arrays;

public class canjump {
    static boolean canJump(int[] nums) {
        if(!Arrays.toString(nums).contains("0")) return true;
        int finalPostion = nums.length - 1;
        for (int i=nums.length -2;i>=0;i++){
            if(i+nums[i]>=finalPostion){
                finalPostion = i;
            }
        }
        return finalPostion == 0;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(canJump(nums));
    }
}
