package org.example;

import java.util.TreeMap;

public class hand_of_straights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;

        if(n % groupSize != 0) return false;

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int card : hand){
            map.put(card,map.getOrDefault(card,0) +1);
        }

        while (!map.isEmpty()){
            int curr = map.firstKey();

            for (int i=0;i<groupSize;i++){
                if (!map.containsKey(curr + i)) return false;

                map.put(curr+i,map.get(curr+i) -1);
                if(map.get(curr + i) == 0){
                    map.remove(curr + i);
                }
            }
        }
        return true;
    }
}
