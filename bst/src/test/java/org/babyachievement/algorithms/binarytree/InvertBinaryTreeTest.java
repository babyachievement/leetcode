package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/14 13:40
 */
public class InvertBinaryTreeTest {

    @Test
    public void invertTree() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        assertNull(invertBinaryTree.invertTree(null));

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode treeNode = invertBinaryTree.invertTree(root);
        assertThat(treeNode.val, is(4));
        assertThat(treeNode.left.val, is(7));
        assertThat(treeNode.right.val, is(2));
        assertThat(treeNode.left.left.val, is(9));
        assertThat(treeNode.left.right.val, is(6));
    }
}