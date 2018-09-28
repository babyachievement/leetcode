package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 15:14
 */
public class DiameterOfBinaryTree543Test {

    @Test
    public void diameterOfBinaryTree() {
        final TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        final DiameterOfBinaryTree543 diameterOfBinaryTree543 = new DiameterOfBinaryTree543();
        assertThat(diameterOfBinaryTree543.diameterOfBinaryTree(root), is(3));
    }
}