package com.code.Trees;

/**
 * @author prem chand shah on 17-06-2018
 * @project myJava
 */
public class IsBst {
    public static boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null)
            return true;
        if (root.data < min || root.data > max)
            return false;
        return isBinarySearchTree(root.left, min, root.data) &&
                isBinarySearchTree(root.right, root.data, max);
    }

    public static void main(String[] args) {
        System.out.println(isBinarySearchTree(CreateTree.returnBT(), Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(isBinarySearchTree(CreateTree.returnBST(), Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(isBinarySearchTree(CreateTree.returnBtForest(), Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(isBinarySearchTree(CreateTree.returnBstForest(), Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    private boolean isBinarySearchTree(Node root) {
        if (root == null)
            return true;
        if (root.right != null && root.right.data < root.data)
            return false;
        if (root.left != null && root.left.data > root.data)
            return false;
        return true;
    }
}
