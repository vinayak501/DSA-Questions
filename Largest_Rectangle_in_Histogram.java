package org.example;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public int[] previous_smaller(int[] a){
        int ps[] = new int[a.length];
        Stack<Integer> s= new Stack();
        for (int i=0;i<a.length;i++){
            while (!s.isEmpty() && a[s.peek()] >= a[i]) s.pop();
            if (s.isEmpty()) ps[i] = -1;
            else ps[i] = s.peek();
            s.push(i);
        }
        return ps;
    }

    public int[] next_smaller(int[] a){
        int ns[] = new int[a.length];
        Stack<Integer> s= new Stack();
        for (int i=a.length-1;i>=0;i--){
            while (!s.isEmpty() && a[s.peek()] <= a[i]) s.pop();
            if (s.isEmpty()) ns[i] = -1;
            else ns[i] = s.peek();
            s.push(i);
        }
        return ns;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ps[] = previous_smaller(heights);
        int ns[] = next_smaller(heights);
        int max_ans = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int ans = (ns[i] - ps[i] - 1)*heights[i];
            max_ans = Math.max(max_ans,ans);
        }
        return max_ans;
    }
}
