package app;

public class Node {
    Node prev;
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}