package org.example;

import java.util.HashSet;

public class set_mismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int actual_sum = n * (n+1)/2;
        int array_sum = 0;
        int unique_sum = 0;
        HashSet<Integer> st= new HashSet<>();
        for (int i : nums){
            array_sum += i;
        }
        for (int i : nums){
            st.add(i);
        }
        for (int i :st){
            unique_sum += i;
        }
        int duplicate = actual_sum - unique_sum;
        int missing = array_sum - unique_sum;
        return new int[] {duplicate,missing};
    }
}
