package com.code.linklist;

/**
 * @author prem chand shah on 08-05-2018
 * @project myJava
 */
public class Node {
    private static int data;
    private static Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
