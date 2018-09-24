package com.code.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author prem chand shah on 17-05-2018
 * @project myJava
 */
public class LevelOrderTraversalLineByLIne {


    public static void traverse(Node tree) {
        if (tree == null)
            return;
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(tree);

        while (true) {
            int nodeSize = nodeQueue.size();
            if (nodeSize <= 0)
                break;

            while (nodeSize > 0) {
                Node temp = nodeQueue.peek();
                System.out.print(temp.data);
                nodeQueue.remove();
                if (temp.left != null)
                    nodeQueue.add(temp.left);
                if (temp.right != null)
                    nodeQueue.add(temp.right);
                nodeSize--;
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        CreateTree create = new CreateTree();
        Node tree = create.returnBT();
        LevelOrderTraversalLineByLIne.traverse(tree);
    }
}
