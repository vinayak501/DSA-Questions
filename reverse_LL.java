package org.example;

import java.util.Stack;

public class reverse_LL {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }

    public ListNode reverseList_1(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode reverseList_recursion(ListNode head) {
        return reverse(head);
    }
}
