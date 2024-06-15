package org.example;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    List<int[]> minstack;

    public MinStack() {
        minstack = new ArrayList<>();
    }

    public void push(int val) {
        if (minstack.size() == 0){
            minstack.add(minstack.size() , new int[]{val,val});
            return;
        }
        int min = getMin();
        minstack.add(minstack.size(),new int[]{val,Math.min(val,min)});
    }

    public void pop() {
        minstack.remove(minstack.size() - 1);
    }

    public int top() {
        return minstack.get(minstack.size() - 1)[0];
    }

    public int getMin() {
        return minstack.get(minstack.size() - 1)[1];
    }
}
