package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/11 16:20
 */
public class MaximumBinaryTreeTest {

    @Test
    public void constructMaximumBinaryTree() {
        // 3,2,1,6,0,5
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.right = new TreeNode(1);

        treeNode.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(0);

        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        assertTrue(BSTUtils.compareBSTS(root, treeNode));

        root = maximumBinaryTree.constructMaximumBinaryTree2(new int[]{3, 2, 1, 6, 0, 5});
        assertTrue(BSTUtils.compareBSTS(root, treeNode));

    }
}