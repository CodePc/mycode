package com.code.Trees;

import java.util.Stack;

/**
 * @author prem chand shah on 18-05-2018
 * @project myJava
 */
public class InorderWithoutRec {
    public static void inorderNoRec(Node root) {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        while (stack.size() > 0) {
            current = stack.pop();
            System.out.println(current.data);
            if (current.right != null) {
                current = current.right;
                // search in left of right node if exist
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
            }
        }

    }

    public static void main(String[] args) {
        CreateTree bt = new CreateTree();
        Node root = bt.returnBT();
        InorderWithoutRec.inorderNoRec(root);

    }
}
