package com.code.linklist;


/**
 * @author prem chand shah on 08-05-2018
 * @project myJava
 * <p>
 * Method 1:
 * Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2 and return the node at count/2.
 * <p>
 * Method 2:
 * Traverse linked list using two pointers. Move one pointer by one and other pointer by two.
 * When the fast pointer reaches end slow pointer will reach middle of the linked list.
 */


/**This is method 2 impl*/
public class MiddleOfLinkedList {

    Node head; // head of linked list

    /* Linked list node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /**
     * Function to print middle of linked list
     */
    void printMiddle() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                    slow_ptr.data + "] \n");
        }
    }

    /**
     * Inserts a new Node at front of the list.
     */

    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /**
     * This function prints contents of linked list
     * starting from  the given node
     */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    /**This function is in LinkedList class.
     Inserts a new node after the given prev_node. This method is
     defined inside LinkedList class shown above */
    public void insertAfter(Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
       3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    /** Appends a new node at the end.  This method is
     defined inside LinkedList class shown above */
    public void append(int new_data) {
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null) {
            head = new Node(new_data);
            return;
        }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList llist = new MiddleOfLinkedList();
        for (int i = 5; i > 0; --i) {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }

        /**test for list having single node*/
//        llist.push(1);
//        llist.printList();
//        llist.printMiddle();
    }
}


