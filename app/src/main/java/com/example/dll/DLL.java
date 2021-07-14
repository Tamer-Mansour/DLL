package com.example.dll;

public class DLL {
    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }
//    public boolean isEmpty(){
//        return head == null;
//    }

    public void printValuesBackward() {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }

    public Node pop() {
        if (tail == null) {
            System.out.println("No Nodes");
        }
        Node i = tail;
        tail = i.previous;
        return i;
    }

    public boolean contains(Integer value) {
        if (head == null) {
            System.out.println("No Nodes");
        }
        Node n = head;
        while (n != null) {
            if (n.value == value) {
                System.out.println("Value");
            }
            n = n.next;
        }
        System.out.println("No value");
        return false;
    }

    public int size() {
        if (head == null) {
            System.out.println("null");
        }
        Node n = head;
        int count = 0;
        while (n != null) {
            count++;
            n = n.next;
        }
        System.out.println(count);
        return count;
    }

    public void insertAt(Node newNode, int index) {

        Node r = new Node(index);
        r.next = head;
        head = r;
        if (head == null) {
            head = new Node(20);
        } else {
            Node h = new Node(40);
            head.previous = h;
            head = h;
        }

    }

    public void removeAt(int index) {
        if (head == null) {
            Node d = head;
            if (index == 0) {
                head = d.next;
                return;
            }
            for (int q = 0; d != null && q < index - 1; q++) {
                d = d.next;
                if (d == null || d.next == null) {
                    Node next = d.next.next;
                    d.next = next;
                }

            }
        }
    }
}
