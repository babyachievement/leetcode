package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryTreeRightSideViewTest {

    @Test
    public void rightSideView() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();
        List<Integer> integers = binaryTreeRightSideView.rightSideView(root);
        assertThat(integers.size(), is(3));
        assertTrue(integers.containsAll(Arrays.asList(1, 3, 4)));
    }
}