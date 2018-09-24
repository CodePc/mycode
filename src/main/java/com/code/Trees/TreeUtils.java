package com.code.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author prem chand shah on 17-05-2018
 * @project myJava
 */
public class TreeUtils {

    public static int height(Node tree) {
        if (tree == null)
            return 0;
        int lHeight = height(tree.left);
        int rHeight = height(tree.right);
        if (lHeight > rHeight)
            return lHeight + 1;
        else
            return rHeight + 1;
    }

    public void inOrder(Node tree) {
        if (tree == null)
            return;
        inOrder(tree.left);
        System.out.println(tree.data);
        inOrder(tree.right);
    }

    public static void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1 && height(root) >= level) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        } else
            System.out.println("Level don't exist");
    }

    public static void iterativePreOrder(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null)
            return;
        stack.push(root);
        while (stack.empty() == false) {
            Node current = stack.peek();
            System.out.println(current.data);
            stack.pop();
            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }

    public static void recInOrder(Node root) {
        if (root == null)
            return;
        recInOrder(root.left);
        System.out.print(root.data + "  ");
        recInOrder(root.right);
    }

    /**
     * This wrong need to check
     */
    public static void iterativeInorder(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root == null)
            return;
        Node current = root;
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        while (stack.size() > 0) {
            current = stack.pop();
            System.out.print(current.data + " ");
            if (current.right != null) {
                stack.push(current.right);
                while (current != null)
                    current = current.left;
            }
        }
    }

    public static void iterativePostOrder(Node node) {
    }

    public static void diagonalTrversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node current = queue.peek();
            queue.remove();

            if (current == null) {
                if (queue.isEmpty()) {
                    return;
                }
                System.out.println();
                queue.add(null);
            } else {
                while (current != null) {
                    System.out.println(current.data);
                    if (current.left != null) {
                        queue.add(current.left);
                    }
                    current = current.right;
                }
            }
        }
    }

    static int sizeOfTree(Node node) {
        if (node == null)
            return 0;
        else
            return (sizeOfTree(node.left) + 1 + sizeOfTree(node.right));
    }

    public static boolean searchInBT(Node root, int data) {
        if (root == null)
            return false;
        else if (root.data == data)
            return true;
        if (searchInBT(root.left, data))
            return true;
        else if (searchInBT(root.right, data))
            return true;
        else
            return false;
    }

    public static Node lowestCommonAncestorBT(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data == n1 || root.data == n2)
            return root;
        Node leftNode = lowestCommonAncestorBT(root.left, n1, n2);
        Node rightNode = lowestCommonAncestorBT(root.right, n1, n2);
        if (leftNode != null && rightNode != null)
            return root;
        if (leftNode == null && rightNode == null) {
            return null;
        }
        return leftNode != null ? leftNode : rightNode;

    }

    public static Node lowestCommonAncestorBST(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.data > Integer.max(n1, n2)) {
            return lowestCommonAncestorBST(root.left, n1, n2);
        } else if (root.data < Integer.min(n1, n2)) {
            return lowestCommonAncestorBST(root.right, n1, n2);
        } else
            return root;
    }

    public static void main(String[] args) {
        CreateTree bt = new CreateTree();
        Node BT = bt.returnBT();
//        System.out.println(TreeUtils.height(tree));
//
//        System.out.println("Level order at level ");
//
//        TreeUtils.printGivenLevel(tree, 3);
//        System.out.println("Iterative pre-order traversal");
//        TreeUtils.iterativePreOrder(tree);
//        System.out.println("Iterative inorder traversal");
//        TreeUtils.iterativeInorder(tree);

//        System.out.println("Iterative post-order traversal");
//        TreeUtils.iterativePostOrder(tree);

//        System.out.println("Iterative diagonal traversal");
//        TreeUtils.diagonalTrversal(tree);

//

//        /**This impl of iterative solution is wrong*/
//        Node BST = bt.returnBST();
//        TreeUtils.iterativeInorder(BST);
//
//        System.out.println("\n");
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.printInorder(BST);
//
//        System.out.println("\n" + "lowestCommonAncestorBST(BST,10,75)" + "\n");
//        System.out.println(TreeUtils.lowestCommonAncestorBST(BST, 15, 20).data);
        iterativeInorder(CreateTree.returnBstForest());
        System.out.println();
        recInOrder(CreateTree.returnBstForest());
    }
}
