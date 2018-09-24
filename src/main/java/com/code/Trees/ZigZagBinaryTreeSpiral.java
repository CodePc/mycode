package com.code.Trees;

import java.util.Stack;

/**
 * @author prem chand shah on 15-06-2018
 * @project myJava
 */
public class ZigZagBinaryTreeSpiral {
    public static void printSpiral(Node node) {
        int h = TreeUtils.height(node);
        int i;

        /* ltr -> left to right. If this variable is set then the
           given label is transversed from left to right */
        boolean ltr = false;
        for (i = 1; i <= h; i++) {
            printGivenLevel(node, i, ltr);

            /*Revert ltr to traverse next level in opposite order*/
            ltr = !ltr;
        }
    }

    public static void printGivenLevel(Node root, int level, boolean ltr) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            if (ltr != false) {
                printGivenLevel(root.left, level - 1, ltr);
                printGivenLevel(root.right, level - 1, ltr);
            } else {
                printGivenLevel(root.right, level - 1, ltr);
                printGivenLevel(root.left, level - 1, ltr);
            }
        }
    }

    public static void main(String[] args) {
        Node root = CreateTree.returnBT();
        ZigZagBinaryTreeSpiral.printSpiral(root);
        System.out.println();
        System.out.println("*************");
        ZigZagBinaryTreeSpiral.printAtGivenLevelTwoStack(root);
    }

    public static void printAtGivenLevelTwoStack(Node node) {
        if (node == null)
            return;
        Stack<Node> firstLevel = new Stack<>();
        firstLevel.push(node);
        Stack<Node> secondLevel = new Stack<>();
        while (!firstLevel.isEmpty() || !secondLevel.isEmpty()) {
            while (!firstLevel.isEmpty()) {
                Node current = firstLevel.pop();
                System.out.print(current.data + " ");
                if (current.right != null)
                    secondLevel.push(current.right);
                if (current.left != null)
                    secondLevel.push(current.left);

            }

            while (!secondLevel.empty()) {
                Node current = secondLevel.pop();
                System.out.print(current.data + " ");
                if (current.left != null)
                    firstLevel.push(current.left);
                if (current.right != null)
                    firstLevel.push(current.right);
            }
        }
    }
}
