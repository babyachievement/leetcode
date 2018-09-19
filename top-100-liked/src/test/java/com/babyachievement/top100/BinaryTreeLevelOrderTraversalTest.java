package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/18 14:30
 */
public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        TreeNode                      root  = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> lists = traversal.levelOrder(root);
        assertThat(lists.size(), is(3));
        assertThat(lists.get(0).size(), is(1));
        assertThat(lists.get(0).get(0), is(3));
        assertThat(lists.get(2).get(1), is(7));
    }
}