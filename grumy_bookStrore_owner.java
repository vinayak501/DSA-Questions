package org.example;

public class grumy_bookStrore_owner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int unsat = 0;
        for (int i=0;i<minutes;i++){
            unsat += customers[i] * grumpy[i];
        }
        int maxunsat = unsat;
        int i = 0;
        int j = minutes;
        while (j<n){
            unsat += customers[j] * grumpy[j];
            unsat -= customers[i] * grumpy[i];

            maxunsat = Math.max(maxunsat,unsat);
            i++;
            j++;
        }

        int tatal = maxunsat;

        for (int x=0;x<n;x++){
            tatal += customers[x] * (1-grumpy[x]);
        }
        return tatal;

    }
}
