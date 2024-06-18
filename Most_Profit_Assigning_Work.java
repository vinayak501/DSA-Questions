package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Most_Profit_Assigning_Work {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = profit.length;
        int m = worker.length;

        List<int[]> vec = new ArrayList<>();

        for (int i=0;i<n;i++){
            vec.add(new int[]{difficulty[i],profit[i]});
        }

        Collections.sort(vec, Comparator.comparingInt(a -> a[0]));

        for (int i=0;i<vec.size();i++){
            vec.get(i)[1] =  Math.max(vec.get(i)[1] , vec.get(i-1)[1]);
        }

        int totalProfit = 0;

        for (int i=0;i<m;i++){
            int workD = worker[i];

            int l = 0,r= vec.size() - 1;
            int maxP = 0;
            while (r >= l){
                int mid = l + (r-1) / 2;
                if (vec.get(mid)[0] <= workD){
                    maxP = Math.max(maxP,vec.get(mid)[1]);
                    l = mid +1;
                }else {
                    r = mid -1;
                }
            }
            totalProfit += maxP;
        }
        return totalProfit;
    }
}
