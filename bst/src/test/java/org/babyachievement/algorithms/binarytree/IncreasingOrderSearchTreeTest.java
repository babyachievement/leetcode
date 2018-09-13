package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingOrderSearchTreeTest {

    @Test
    public void increasingBST() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);

        IncreasingOrderSearchTree increasingOrderSearchTree = new IncreasingOrderSearchTree();
        TreeNode treeNode = increasingOrderSearchTree.increasingBST(root);
        while (treeNode!=null) {
            System.out.println(treeNode.val);
            treeNode = treeNode.right;
        }
    }


    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(379);
        treeNode.left = new TreeNode(826);
        new IncreasingOrderSearchTree().increasingBST(treeNode);
    }
}