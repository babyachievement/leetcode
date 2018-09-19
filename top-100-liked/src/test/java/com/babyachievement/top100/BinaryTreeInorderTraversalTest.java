package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/18 14:20
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();
        TreeNode                   root  = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> integers = traversal.inorderTraversal(root);
        assertThat(integers.size(), is(3));
        assertThat(integers.get(0), is(1));
        assertThat(integers.get(1), is(3));

        assertThat(integers.get(2), is(2));
    }
}