package com.code.Trees;

/**
 * Created by prem on 5/16/2017.
 */
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.data + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.data + " ");

        /* then recur on left sutree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    void printPostorder() {
        printPostorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        System.out.println("Preorder traversal of binary tree is ");
        binaryTree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        binaryTree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        binaryTree.printPostorder();
    }
}
