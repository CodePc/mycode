package com.code.Trees;

/**
 * @author prem chand shah on 17-05-2018
 * @project myJava
 */
public class CreateTree {

    public static Node returnBT() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        return root;
    }

    public static Node returnBST() {
        Node root = new Node(20);
        root.left = new Node(15);
        root.left.right = new Node(18);
        root.left.left = new Node(10);
        root.right = new Node(60);
        root.right.left = new Node(30);
        root.right.right = new Node(65);
        root.right.right.right = new Node(75);
        root.right.right.left = new Node(64);
        return root;
    }

    public static Node returnBstForest() {

        Node root = new Node(50);
        root.left = new Node(10);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.left.left = new Node(4);
        root.left.left.right = new Node(6);
        root.left.right = new Node(20);
        root.left.right.left = new Node(15);
        root.left.right.right = new Node(21);
        root.left.right.left.left = new Node(11);
        root.left.right.left.right = new Node(18);
        root.left.right.left.right.left = new Node(17);
        root.left.right.left.right.right = new Node(19);
        root.right.left = new Node(58);
        root.right.left.left = new Node(56);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        root.right.left.left.left = new Node(54);
        root.right.left.left.right = new Node(57);
        root.right.left.left.left.left = new Node(52);
        root.right.left.left.left.right = new Node(55);

        return root;
    }


    public static Node returnBtForest() {
        Node root = new Node(50);
        root.left = new Node(10);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.left.left = new Node(4);
        root.left.left.right = new Node(6);
        root.left.right = new Node(20);
        root.left.right.left = new Node(15);
        root.left.right.right = new Node(21);
        root.left.right.right.left = new Node(40);
        root.left.right.right.right = new Node(73);
        root.left.right.left.left = new Node(11);
        root.left.right.left.right = new Node(18);
        root.left.right.left.right.left = new Node(17);
        root.left.right.left.right.right = new Node(19);
        root.right.left = new Node(55);
        root.right.left.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        root.right.left.left.left = new Node(40);
        root.right.left.left.right = new Node(50);
        root.right.left.left.left.left = new Node(35);
        root.right.left.left.left.right = new Node(42);


        return root;
    }
}
