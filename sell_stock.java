package org.example;

import java.util.Arrays;

public class sell_stock {
    static int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            lowest = Math.min(lowest,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-lowest);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
