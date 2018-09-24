package com.code.linklist;

/**
 * @author prem chand shah on 01-06-2018
 * @project myJava
 */
public class DetectAndRemoveLoop {
    public Boolean detectLoop(Node head) {
        Node fast = head;
        Node slow = head;
        while (slow != null && fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        if (fast == slow) {
            removeLoop(slow, head);
            return true;
        }
        return false;
    }

    private void removeLoop(Node loop, Node curr) {
        Node ptr1 = null;
        Node ptr2 = null;

    }
}
