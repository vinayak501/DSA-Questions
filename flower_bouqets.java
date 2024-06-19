package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class flower_bouqets {

//    ******************************************** Brute Force *****************************************************
//    public int minDays(int[] bloomDay, int m, int k) {
//        int n = bloomDay.length;
//        if (m*k > n){
//            return -1;
//        }
//        int max = 0;
//        for (int num : bloomDay){
//            max = Math.max(max,num);
//        }
//        int ans = -1;
//
//        for (int i=max;i>0;i--){
//            int flower= 0;
//            int total = 0;
//            for (int j=0;j<n;j++){
//                if (bloomDay[j] >= i){
//                    flower++;
//                }
//                if (flower == k){
//                    total++;
//                }
//                if (total == m){
//                    ans = i;
//                    break;
//                }
//            }
//        }
//
//        return ans;
//    }

//    ******************************************** Optimized *****************************************************

    public boolean makeBouqets(int day,int[] bloomDay,int m,int k){
            int flower= 0;
            int total = 0;
            for (int j=0;j<bloomDay.length;j++){
                if (bloomDay[j] <= day){
                    flower++;
                }else {
                    flower = 0;
                }
                if (flower == k){
                    total++;
                    flower = 0;
                }
                if (total == m){
                    return true;
                }
           }
            return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length){
            return -1;
        }
        int mindays = -1;
        int startDay = 1;
        int endDay = Arrays.stream(bloomDay).max().getAsInt();
        while (startDay <= endDay){
            int mid = startDay + (endDay-startDay) / 2;

            if (makeBouqets(mid,bloomDay,m,k)){
                mindays = mid;
                endDay = mid -1;
            }else {
                startDay = mid +1;
            }
        }
        return mindays;
    }

}
