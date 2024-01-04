package org.example;

public class cancompletecircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int Tgas = 0;
        int Tcost =0;
        int answer = 0;
        int i_to_i_cost = 0;
        for (int i=0;i<gas.length;i++){
            Tgas += gas[i];
            Tcost += cost[i];
        }
        if(Tcost>Tgas) return -1;
        for (int i=0;i<gas.length;i++){
            i_to_i_cost += gas[i] - cost[i];
            if(i_to_i_cost < 0){
                i_to_i_cost = 0;
                answer++;
            }
        }
        return answer;
    }
}
