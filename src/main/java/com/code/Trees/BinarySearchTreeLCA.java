package com.code.Trees;

/**
 * @author prem chand shah on 13-06-2018
 * @project myJava
 */

// wrong
public class BinarySearchTreeLCA {
    public static Node LCSofBST(Node root, int a, int b) {
        if (root == null)
            return null;
        if (root.data > Integer.max(a, b))
            LCSofBST(root.right, a, b);
        else if (root.data < Integer.max(a, b))
            LCSofBST(root.left, a, b);
        return root;

    }

    public static void main(String[] args) {
        CreateTree getTree = new CreateTree();
        Node root = getTree.returnBST();
        Node lcsNode = BinarySearchTreeLCA.LCSofBST(root, 30, 64);
        System.out.println(lcsNode.data);
    }
}
