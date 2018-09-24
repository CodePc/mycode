package com.code.Trees;

import java.util.HashSet;
import java.util.Set;

/**
 * @author prem chand shah on 27-05-2018
 * @project myJava
 */
public class PairInBST {
    Set<Integer> set = new HashSet<>();

    public boolean pairExist(Node root, int sum) {
        if (root == null)
            return false;
        if (root.data == sum) {
            set.add(root.data);
        }
        if (set.contains(sum - root.left.data))
            return true;
        if (set.contains(sum - root.right.data))
            return true;
        else return false;
    }
}
