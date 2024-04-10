package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reveal_card_in_increasing_order {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Arrays.fill(result,0);
        Arrays.sort(deck);

        boolean skip = false;

        int i = 0;
        int j = 0;

        while (i<n){
            if (result[i] == 0){
                if (skip == false){
                    result[j] = deck[i];
                    i++;
                }
                skip = !skip;
            }
            j = (j+1)%n;
        }
        return result;
    }
}
