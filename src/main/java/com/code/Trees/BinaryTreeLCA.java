package com.code.Trees;

/**
 * @author prem chand shah on 13-06-2018
 * @project myJava
 */
public class BinaryTreeLCA {
    public static Node findLCSA(Node root, int a, int b) {
        if (root == null)
            return null;
        if (root.data == a || root.data == b) {
            return root;
        }
        Node left = findLCSA(root.left, a, b);
        Node right = findLCSA(root.right, a, b);

        if (left != null && right != null)
            return root;
        if (left == null && right == null)
            return null;
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        CreateTree B = new CreateTree();
        Node root = B.returnBT();
        Node lcsNode = BinaryTreeLCA.findLCSA(root, 3, 6);
        System.out.println(lcsNode.data);
    }
}
