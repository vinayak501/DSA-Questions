package org.example;

import java.util.ArrayList;
import java.util.List;

public class LEETCODE_WEEKLY {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        int arr1_last = nums[0];
        arr2.add(nums[1]);
        int arr2_last = nums[1];
        for (int i=2;i<n;i++){
            if (arr1_last > arr2_last){
                arr1.add(nums[i]);
                arr1_last = nums[i];
            }else {
                arr2.add(nums[i]);
                arr2_last = nums[i];
            }
        }
        arr1.addAll(arr2);
        int[] ans = new int[n];
        for (int i=0;i<arr1.size();i++){
            ans[i] = arr1.get(i);
        }
        return ans;
    }


    //***********************************************************************************************************


    public int greaterCount(List<Integer> arr , int k){
        int count = 0;
        for (int i=0;i<arr.size();i++){
            if (arr.get(i) > k) count++;
        }
        return count;
    }
    public int[] resultArray_hard(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i=2;i<n;i++){
            if (greaterCount(arr1,nums[i]) > greaterCount(arr2,nums[i])) arr1.add(nums[i]);
            else if (greaterCount(arr1,nums[i]) < greaterCount(arr2,nums[i])) arr2.add(nums[i]);
            else if (greaterCount(arr1,nums[i]) == greaterCount(arr2,nums[i])){
                if (arr1.size() < arr2.size()) arr1.add(nums[i]);
                else if (arr1.size() > arr2.size()) arr2.add(nums[i]);
                else arr1.add(nums[i]);
            }
        }
        arr1.addAll(arr2);
        int[] ans = new int[n];
        for (int i=0;i<arr1.size();i++){
            ans[i] = arr1.get(i);
        }
        return ans;
    }
}
