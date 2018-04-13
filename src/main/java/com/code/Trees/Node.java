package com.code.Trees;

/**
 * Created by prem on 5/16/2017.
 */
public class Node {
    int data;
    Node left, right;

    public Node(int item) {
        this.data = item;
        left = right = null;
    }
}
