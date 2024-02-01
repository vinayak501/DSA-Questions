package org.example;

public class fibonaci {
    public int fib(int n) {
        int prev = 1;
        int prev_2 = 0;
        for (int i=0;i<=n;i++){
            int curr = prev_2 + prev;
            prev_2 = prev;
            prev = curr;
        }
        return prev;
    }
}
