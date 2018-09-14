package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/14 13:56
 */
public class BinaryTreePruningTest {

    BinaryTreePruning binaryTreePruning;
    @Before
    public void setUp() throws Exception {
        binaryTreePruning = new BinaryTreePruning();
    }

    @Test
    public void pruneTree() {
        TreeNode root = new TreeNode(1);
         root.right = new TreeNode(0);
         root.right.left = new TreeNode(0);
         root.right.right = new TreeNode(1);

        TreeNode treeNode = binaryTreePruning.pruneTree(root);
        assertThat(treeNode.val, is(1));
        assertThat(treeNode.right.val, is(0));
        assertNull(treeNode.right.left);
        assertThat(treeNode.right.right.val, is(1));
    }


    @Test
    public void pruneTree2() {
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(0);
         root.right = new TreeNode(0);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
         root.right.left = new TreeNode(0);
         root.right.right = new TreeNode(1);

        TreeNode treeNode = binaryTreePruning.pruneTree(root);
        assertThat(treeNode.val, is(1));
        assertThat(treeNode.right.val, is(0));
        assertNull(treeNode.right.left);
        assertThat(treeNode.right.right.val, is(1));
    }
}