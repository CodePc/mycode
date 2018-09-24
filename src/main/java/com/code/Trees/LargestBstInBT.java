package com.code.Trees;

/**
 * @author prem chand shah on 17-06-2018
 * @project myJava
 */
public class LargestBstInBT {
    public static int largestBst(Node root) {
        if (root == null)
            return 0;
        if (IsBst.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return TreeUtils.sizeOfTree(root);
        else
            return Integer.max(largestBst(root.left), largestBst(root.right));
    }

    public static void main(String[] args) {
        System.out.println(largestBst(CreateTree.returnBstForest()));
        System.out.println(largestBst(CreateTree.returnBtForest()));
        System.out.println(TreeUtils.sizeOfTree(CreateTree.returnBstForest()));
    }
}
