package com.code.Trees;

/**
 * @author prem chand shah on 20-05-2018
 * @project myJava
 */
public class BinarySearchTree {

    public Node insertInBST(Node root, int data) {
        if (root == null)
            root = new Node(10);
        else if (data > root.data) {
            root.right = insertInBST(root.right, data);
        } else if (data < root.data) {
            root.left = insertInBST(root.left, data);
        }
        return root;
    }

    public boolean searchInBST(Node root, int data) {
        if (root == null)
            return false;
        else if (root.data == data)
            return true;
        else if (data >= root.data)
            return searchInBST(root.right, data);
        else return searchInBST(root.left, data);

    }

    static boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    static boolean isBSTUtil(Node node, int min, int max) {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data - 1) &&
                isBSTUtil(node.right, node.data + 1, max));
    }

    public static void main(String[] args) {
        System.out.println(isBST(CreateTree.returnBT()));
    }
}
