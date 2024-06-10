package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Integer {
    public int reverse(int x) {
        int flag = 0;
        if (x< 0){
            flag = 1;
            x = -x;
        }
        Queue<Integer> q = new LinkedList<>();
        while (x != 0){
            q.add(x % 10);
            x = x/10;
        }
        long result = 0;
        int n = q.size() - 1;
        while (!q.isEmpty()){
            result += q.poll()*Math.pow(10,n);
            n--;
        }
        if (flag == 1){
            result = -result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }
}
