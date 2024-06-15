package org.example;

import java.util.*;

public class IPO {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = capital.length;

        List<int[]> projects = new ArrayList<>();

        for (int i=0;i<n;i++){
            projects.add(new int[]{capital[i],profits[i]});
        }

        projects.sort(Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> maxprofit = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        while (k-- > 0){
            while (i < n && projects.get(i)[0] <= k){
                maxprofit.add(projects.get(i)[1]);
                i++;
            }
            if (maxprofit.isEmpty()){
                break;
            }
            w += maxprofit.poll();
        }
        return w;
    }
}
