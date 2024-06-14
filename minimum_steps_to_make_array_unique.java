package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class minimum_steps_to_make_array_unique {

//    *************************************** TIME LIMIT EXCEEDED***************************************************
//    public int minIncrementForUnique(int[] nums) {
//        Map<Integer,Integer> save = new HashMap<>();
//        for (int num : nums) {
//            save.put(num, save.getOrDefault(0, save.get(num)) + 1);
//        }
//        int result = 0;
//        for (int i=0;i<nums.length;i++){
//            int curr = nums[i];
//            while (save.get(nums[i]) > 1){
//                while (save.containsKey(nums[i])){
//                    nums[i]++;
//                    result++;
//                }
//                save.put(nums[i],1);
//                save.put(curr,save.get(curr)-1);
//            }
//        }
//        return result;
//    }

//********************************************** SECOND APPROACH************************************************
//    public int minIncrementForUnique(int[] nums) {
//        Arrays.sort(nums);
//        int result = 0;
//        for (int i=1;i<nums.length;i++){
//            if (nums[i] == nums[i-1]){
//                nums[i]++;
//                result++;
//            }else if (nums[i] < nums[i-1]){
//                result += nums[i-1] - nums[i] + 1;
//                nums[i] += nums[i-1] + 1;
//            }
//        }
//        return result;
//    }

    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        int max = 0;
        int result = 0;

        for (int num : nums){
            max = Math.max(max,num);
        }

        int[] save = new int[max+n+1];

        for (int num : nums){
            save[num]++;
        }

        for (int i=0;i<save.length;i++){
            if (save[i] <=1 ) continue;
            int extra = save[i] - 1;
            save[i+1] += extra;
            save[i] = 1;
            result+= extra;
        }
        return result;
    }
}
