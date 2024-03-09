package org.example;

import java.util.HashMap;
import java.util.Map;

public class intersection_node_LL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> mp = new HashMap<>();
        ListNode temp = headA;
        while (temp != null) {
            mp.put(temp, 1);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (mp.containsKey(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
