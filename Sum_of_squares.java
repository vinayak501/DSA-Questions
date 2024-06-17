package org.example;

public class Sum_of_squares {
    public boolean judgeSquareSum(int c) {
        if (c < 0)  return false;
        long start = 0;
        long end = (int) Math.sqrt(c);

        while (end >= start){
            long ans = start * start + end *end;
            if (ans == c) return true;
            if (ans < c){
                start++;
            }else {
                end--;
            }
        }
        return false;
    }
}
