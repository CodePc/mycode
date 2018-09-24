package com.code.Trees;

/**
 * @author prem chand shah on 16-06-2018
 * @project myJava
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Need 1 stack and 1 queue
 * add current in Q if has left and right add to Q
 * pop Q and put it in stack
 */
public class ReverseLevelOrder {

    public static void getReverseOrderLevelTraversal(Node root) {

        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node pop = queue.remove();
            Node current = pop;
            if (current.right != null)
                queue.add(current.right);
            if (current.left != null)
                queue.add(current.left);
            stack.add(current);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        Node current = CreateTree.returnBT();
        ReverseLevelOrder.getReverseOrderLevelTraversal(current);
    }
}
