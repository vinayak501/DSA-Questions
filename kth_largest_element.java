package org.example;

import java.util.PriorityQueue;

public class kth_largest_element {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        for (int num : nums){
            minH.add(num);
            if (minH.size() > k){
                minH.remove();
            }
        }

        return minH.peek();
    }
}
