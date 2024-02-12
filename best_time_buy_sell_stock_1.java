package org.example;

public class best_time_buy_sell_stock_1 {
    static int maximumProfit(int []Arr){
        int maxProfit = 0;
        int mini = Arr[0];

        for(int i=1;i<Arr.length;i++){
            int curProfit = Arr[i] - mini;
            maxProfit = Math.max(maxProfit,curProfit);
            mini = Math.min(mini,Arr[i]);
        }
        return maxProfit;
    }
}
