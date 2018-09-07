package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/7 14:04
 */
public class LowestCommonAncestorTest {

    @Test
    public void lowestCommonAncestor() {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);

        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        assertEquals(root, lowestCommonAncestor.lowestCommonAncestor(root,
                                                                     root.left,
                                                                     root.right));


        assertEquals(root.left, lowestCommonAncestor.lowestCommonAncestor(root,
                                                                     root.left,
                                                                     root.left.right));

    }
}