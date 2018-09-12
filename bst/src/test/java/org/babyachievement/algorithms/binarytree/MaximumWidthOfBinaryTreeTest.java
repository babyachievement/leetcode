package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/12 10:09
 */
public class MaximumWidthOfBinaryTreeTest {

    @Test
    public void widthOfBinaryTree() {
        MaximumWidthOfBinaryTree widthOfBinaryTree = new MaximumWidthOfBinaryTree();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(3);

        assertThat(widthOfBinaryTree.widthOfBinaryTree2(treeNode), is(2));

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.left.left = new TreeNode(3);
        treeNode2.right = new TreeNode(4);
        treeNode2.right.right = new TreeNode(5);
        assertThat(widthOfBinaryTree.widthOfBinaryTree(treeNode2), is(4));

        assertThat(widthOfBinaryTree.widthOfBinaryTree2(new TreeNode(1)), is(1));
    }
}