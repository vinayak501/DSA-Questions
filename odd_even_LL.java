package org.example;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class odd_even_LL {

    // ************************************ VAL REPLACEMENT (LL BRUTE FORCE) ****************************************8

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            arr.add(temp.val);
            temp = temp.next.next;
        }
        if (temp != null) {
            arr.add(temp.val);
        }

        temp = head.next;
        while (temp != null && temp.next != null) {
            arr.add(temp.val);
            temp = temp.next.next;
        }
        if (temp != null) {
            arr.add(temp.val);
        }

        int i = 0;
        temp = head;
        while (temp != null) {
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }

    // ***************************************** LINK REPLACEMENT ***************************************************

    public ListNode oddEvenList_1(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while (even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
