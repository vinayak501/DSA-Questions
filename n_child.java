package org.example;

import java.util.Arrays;

public class n_child {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candy = 0;
        int[] answer = new int[n];
        Arrays.fill(answer,1);
        for (int i=1;i<n;i++){
            if(ratings [i] > ratings[i-1]){
                answer[i] = answer[i-1] + 1;
            }
        }
        for (int i = n-2;i>0;i--){
            if (ratings[i] > ratings[i+1]){
                answer[i] = Math.max(answer[i] , answer[i+1]+1);
            }
        }
        for (int a:answer) {
            candy+=a;
        }
        return candy;
    }
}
