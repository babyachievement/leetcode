package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/28 15:39
 */
public class SubtreeOfAnotherTree572Test {

    @Test
    public void isSubtree() {
        final SubtreeOfAnotherTree572 ofAnotherTree572 = new SubtreeOfAnotherTree572();
        final TreeNode                root         = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        final TreeNode                root2         = new TreeNode(1);
        root2.left = new TreeNode(2);
        assertFalse(ofAnotherTree572.isSubtree(root, root2));
    }
}