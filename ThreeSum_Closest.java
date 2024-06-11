package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ThreeSum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = nums[0] + nums[1] + nums[2];
        for (int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while (k>j){
                int currSum = nums[i] + nums[j] + nums[k];
                if(Math.abs(currSum - target) < Math.abs(answer - target)){
                    answer = currSum;
                }
                if (currSum < target){
                    j++;
                }else if(currSum > target){
                    k--;
                }else {
                    return currSum;
                }
            }
        }
        return answer;
    }
}
