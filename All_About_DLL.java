package org.example;

import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        data = data1;
        next = next1;
        back = back1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        back = null;
    }
}

public class All_About_DLL {
    static Node convertArrToDLL(ArrayList<Integer> arr) {
        Node head = new Node(arr.get(0));
        Node prev = head;
        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i), null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }

    static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        temp.back = null;
        prev.next = null;
        return head;
    }

    static Node removeKthElement(Node head, int k) {
        if (head == null) {
            return null;
        }
        Node knode = head;
        int count = 0;
        while (knode != null) {
            count++;
            if (count == k) {
                break;
            }
            knode = knode.next;
        }
        Node prev = knode.back;
        Node front = knode.next;
        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }

        prev.next = front;
        front.back = prev;

        knode.next = null;
        knode.back = null;

        return head;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, 1, 3, 2, 4));
        Node head = convertArrToDLL(arr);
        print(head);
        System.out.println();
        Node newHead = removeKthElement(head, 2);
        print(newHead);
    }
}
