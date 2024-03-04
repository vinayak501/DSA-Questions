package org.example;
import java.util.*;

public class All_About_insertion_DLL {
    static Node convertArr2DLL(ArrayList<Integer> arr) {
        Node head = new Node(arr.get(0));
        Node prev = head;

        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i), null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node insertBeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.back = newHead;

        return newHead;
    }

    static Node insertBeforeTail(Node head, int val) {
        if (head.next == null) {
            return insertBeforeHead(head, val);
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;

        Node newNode = new Node(val, tail, prev);

        prev.next = newNode;
        tail.back = newNode;

        return head;
    }

    static Node insertBeforeKthElement(Node head, int k, int val) {
        if (k == 1) {
            return insertBeforeHead(head, val);
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }
        Node prev = temp.back;

        Node newNode = new Node(val, temp, prev);

        prev.next = newNode;
        temp.back = newNode;

        newNode.next = temp;
        newNode.back = prev;

        return head;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 5, 8, 7, 4));
        Node head = convertArr2DLL(arr);

        print(head);
        System.out.println("\nDoubly Linked List After Inserting val on the kth position: ");
        head = insertBeforeKthElement(head, 2, 10);
        print(head);
    }
}

