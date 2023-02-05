package src.main.java;

public class LinkedList {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    public void addFront(int data) {
        // create Node
        Node newNode = new Node(data);

        // if head is Null
        if (head == null) {
            head = newNode;
            return;
        }

        // else set it to current Head
        newNode.next = head;

        // set Head value to this new node
        head = newNode;
    }

    // Get first Node/ Head
    public int getFirst() {
        return head.data;
    }

    // Get last Node/Tail
    public int getLast() {
        if (head == null) {
            throw new IllegalStateException("EMPTY LIST");
        }
        Node current = head;

        // while we are not at Tail, keep pointing to the next Node
        while(current.next != null) {
            current = current.next;
        }

        // til we meet the Tail
        return current.data;
    }
}
