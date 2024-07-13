package org.example;

import java.util.*;

public class robots_collision {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> ind = new ArrayList<>();
        int n = positions.length;
        for (int i=0;i<n;i++){
            ind.add(i);
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return positions[o1] - positions[o2];
            }
        };
        Collections.sort(ind,comparator);
        Stack<Integer> ans = new Stack<>();
        for (int id : ind){
            if (directions.charAt(id) == 'R'){
                ans.push(id);
            }else {
                while (!ans.isEmpty() && healths[id] > 0){
                    if (healths[id] > healths[ans.peek()]){
                        healths[id]--;
                        healths[ans.peek()] = 0;
                        ans.pop();
                    }else if(healths[id] < healths[ans.peek()]){
                        healths[id] = 0;
                        healths[ans.peek()]--;
                    }else {
                        healths[id] = 0;
                        healths[ans.peek()] = 0;
                        ans.pop();
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<n;i++){
            if (healths[i] > 0){
                    res.add(healths[i]);
            }
        }
        return res;
    }
}
