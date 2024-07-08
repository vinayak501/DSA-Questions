package org.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class find_the_winner_circular_game {
// ***************************************** Queue ************************************************************
//    public int findTheWinner(int n, int k) {
//        Queue<Integer> q = new LinkedList<>();
//        for (int i=1;i<=n;i++){
//            q.add(i);
//        }
//        while (q.size() > 1){
//            for (int count=1;count<=k-1;count++){
//                q.add(q.peek());
//                q.poll();
//            }
//            q.poll();
//        }
//        return q.peek();
//    }

// ***************************************** Recursion ************************************************************

    private int findWinnerIdx(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int idx = findWinnerIdx(n - 1, k);
        idx = (idx + k) % n;
        return idx;
    }

    public int findTheWinner(int n, int k) {
        int res = findWinnerIdx(n,k);
        return res+1;
    }
}
