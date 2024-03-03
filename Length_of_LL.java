package org.example;

public class Length_of_LL {
    public int LenghtOfLL(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
