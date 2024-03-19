package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class contest_388 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApple = 0;
        for(int i=0;i<apple.length;i++){
            totalApple += apple[i];
        }
        Arrays.sort(capacity);
        int x = capacity.length - 1;
        int ans = 0;
        int totalBoxcapacity = 0;
        while (totalBoxcapacity < totalApple){
            totalBoxcapacity += capacity[x];
            x--;
            ans++;
        }
        return ans;
    }

    //*************************************************************************************************************


    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int ans = 0;
        int n = happiness.length - 1;
        int selectedCount = 0;
        while (k != 0){
            if (n == happiness.length -1){
                ans += happiness[n];
                selectedCount++;
                k--;
            } else if (happiness[n] > selectedCount) {
                ans += happiness[n] - selectedCount;
                selectedCount++;
                k--;
            } else {
                break;
            }
        }
        return ans;
    }

    //*****************************************************************************************************************

    public int sum(int[] arr){
        int total = 0;
        for (int i : arr){
            total += i;
        }
        return total;
    }

    //*****************************************************************************************************************


}
