package org.example;

public class Maximum_twin_of_LL {
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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverse(slow);
        ListNode temp1= head;
        ListNode temp2 = newHead;
        int ans = Integer.MIN_VALUE;
        while (temp2 != null){
            ans = Math.max(ans,temp2.val + temp1.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        reverse(newHead);
        return ans;
    }
}
