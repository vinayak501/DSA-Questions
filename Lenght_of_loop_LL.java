package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lenght_of_loop_LL {
    public int lenghtOfLL(ListNode head){
        Map<ListNode,Integer> mp = new HashMap<>();
        ListNode temp =head;
        int timer = 0;
        while (temp != null){
            if (mp.containsKey(temp)){
                int valu = mp.get(temp);
                return timer - valu;
            }
            mp.put(temp,timer);
            timer++;
            temp = temp.next;
        }
        return 0;
    }

    // ********************************************************************************************************

    public int findLength(ListNode slow,ListNode fast){
        int count = 1;
        fast = fast.next;
        while (slow != fast){
            count++;
            fast =fast.next;
        }
        return count;
    }
    public int  LenghtOfLL(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) return findLength(slow,fast);
        }
        return 0;
    }
}
