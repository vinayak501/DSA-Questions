package org.example;

public class single_number_3 {
    public int[] singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums){
            result = result ^ num;
        }
        int k = 0;
        while ((result & 1) == 0){
            result >>= 1;
            k++;
        }
        int first = 0;
        int second = 0;
        int i = 1 << k;
        for (int num : nums){
            if ((num & i) == 0){
                first ^= num;
            }else {
                second ^= num;
            }
        }
        return new int[]{first,second};
    }
}
