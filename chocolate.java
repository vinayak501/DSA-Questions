package org.example;

import java.util.Arrays;

public class chocolate {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum = prices[0] + prices[1];
        if(sum <= money){
            return money -sum;
        }else {
            return money;
        }
//        int n = prices.length;
//        int answer = money;
//        for (int i=0;i<n-1;i++){
//            int sum = prices[i] + prices[i+1];
//            if(sum<=money){
//                answer = Math.min(answer , money - sum);
//            }
//        }
//        return answer;
    }
}
