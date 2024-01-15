package org.example;

import java.util.*;

public class one_or_zero_losses {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> lost = new HashMap<>();

        for(int[] it : matches){
            int lose = it[1];
            lost.put(lose,lost.getOrDefault(lose,0)+1);
        }

        List<Integer> notlost = new ArrayList<>();
        List<Integer> onelose = new ArrayList<>();

        for (int[] it:matches){
            int lose = it[1];
            int win = it[0];

            if(lost.get(lose)==1){
                onelose.add(lose);
            }
            if(!lost.containsKey(win)){
                notlost.add(win);
                lost.put(win,2);
            }
        }
        Collections.sort(notlost);
        Collections.sort(onelose);

        return Arrays.asList(notlost,onelose);
    }
}
