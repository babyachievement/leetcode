package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/13 17:25
 */
public class BoundaryOfBinaryTreeTest {

    @Test
    public void boundaryOfBinaryTree() {
        BoundaryOfBinaryTree boundary = new BoundaryOfBinaryTree();
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(4);

        List<Integer> integers = boundary.boundaryOfBinaryTree(treeNode);
        assertThat(integers.size(), is(4));

        assertThat(integers.get(0), is(1));
        assertThat(integers.get(1), is(3));
        assertThat(integers.get(2), is(4));
        assertThat(integers.get(3), is(2));
    }

    @Test
    public void boundaryOfBinaryTree2() {
        BoundaryOfBinaryTree boundary = new BoundaryOfBinaryTree();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        treeNode.right.left = new TreeNode(6);

        treeNode.left.right.left = new TreeNode(7);
        treeNode.left.right.right = new TreeNode(8);

        treeNode.right.left.left = new TreeNode(9);
        treeNode.right.left.right = new TreeNode(10);

        List<Integer> integers = boundary.boundaryOfBinaryTree(treeNode);
        assertThat(integers.size(), is(9));

    }

    @Test
    public void boundaryOfBinaryTree3() {
        BoundaryOfBinaryTree boundary = new BoundaryOfBinaryTree();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        treeNode.left.right.right = new TreeNode(4);

        List<Integer> integers = boundary.boundaryOfBinaryTree(treeNode);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }
}