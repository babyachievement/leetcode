package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 18:26
 */
public class MergeTwoBinaryTrees617Test {

    @Test
    public void mergeTrees() {
        final MergeTwoBinaryTrees617 mergeTwoBinaryTrees617 = new MergeTwoBinaryTrees617();
        final TreeNode               root1               = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        final TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        final TreeNode newRoot = mergeTwoBinaryTrees617.mergeTrees(root1,
                                                                    root2);
        assertThat(newRoot.val, is(3));

    }
}