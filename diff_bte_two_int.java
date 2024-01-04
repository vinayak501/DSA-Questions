package org.example;

public class diff_bte_two_int {
    public int maxProductDifference(int[] nums) {
        int firstBig = 0;
        int secondBig = 0;
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int n:nums){
            if (n > firstBig){
                secondBig = firstBig;
                firstBig = n;
            }else if (n > secondBig){
                secondBig = n;
            }
        }
        for(int n:nums){
            if (n < firstSmall){
                secondSmall = firstSmall;
                firstSmall = n;
            }else if (n > secondSmall){
                secondSmall = n;
            }
        }
        return (firstBig*secondBig)-(firstSmall*secondSmall);
    }
}
