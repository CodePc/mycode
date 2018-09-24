package com.code.Trees;

/**
 * @author prem chand shah on 15-06-2018
 * @project myJava
 */
public class PrintAllAncestors {
    public static boolean getAncestors(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.left.data == data || root.right.data == data ||
                getAncestors(root.left, data) || getAncestors(root.right, data)) {
            System.out.println(root.data);
        }
        return false;
    }

    public static void main(String[] args) {
        CreateTree bt = new CreateTree();
        Node root = bt.returnBT();
        getAncestors(root, 6);
    }
}
