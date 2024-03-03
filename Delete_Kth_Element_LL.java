package org.example;
import org.example.Length_of_LL;

public class Delete_Kth_Element_LL {
    public ListNode deletek(ListNode head,int k){
        Length_of_LL length = new Length_of_LL();
        if (head == null) return head;
        // *********************************delete at start ************************************************

        if (k == 1){
            head = head.next;
            return head;
        }

        // *********************************delete at end ************************************************

        if (k == length.LenghtOfLL(head)){
            if (head == null || head.next == null) return null;
            ListNode temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return temp;
        }

        // *********************************delete at k ************************************************

        int count = 1;
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null){
            count++;
            if (count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }
}
