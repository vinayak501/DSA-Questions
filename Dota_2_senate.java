package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Dota_2_senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();
        int n = senate.length();
        for (int i=0;i<n;i++){
            if (senate.charAt(i) == 'R') qR.add(i);
            else qD.add(i);
        }
        while (!qD.isEmpty() && !qR.isEmpty()){
            int R_ind = qR.peek(); qR.poll();
            int D_ind = qD.peek(); qD.poll();
            if (R_ind < D_ind){
                qR.add(R_ind + n);
            }else {
                qD.add(D_ind + n);
            }
        }
        return qR.isEmpty() ? "Dire" : "Radiant";
    }
}
