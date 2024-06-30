package org.example;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class ugly_number_2 {
    public int nthUglyNumber(int n) {
        TreeSet<Long> st = new TreeSet<>();
        int cnt = 0;
        int ans = 1;
        for (;cnt!=n;){
            long ungly = st.pollFirst();
            ans = (int)ungly;
            st.add(ungly*2);
            st.add(ungly*3);
            st.add(ungly*5);
        }
        return ans;
    }
}
