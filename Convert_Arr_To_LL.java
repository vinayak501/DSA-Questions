package org.example;

public class Convert_Arr_To_LL {
    public ListNode convertArrToLL(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for (int i=1;i<arr.length;i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
