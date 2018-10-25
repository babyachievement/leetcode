package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/25 10:41
 */
public class BinaryTreeZigzagLevelOrderTraversal103Test {

    @Test
    public void zigzagLevelOrder() {
        final BinaryTreeZigzagLevelOrderTraversal103 zigzagLevelOrderTraversal103 = new BinaryTreeZigzagLevelOrderTraversal103();
        final TreeNode                               root                         = new TreeNode(
                3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        final List<List<Integer>> zigzagLevelOrder = zigzagLevelOrderTraversal103.zigzagLevelOrder(root);
        assertArrayEquals(new Integer[]{3}, zigzagLevelOrder.get(0).toArray
                (new Integer[0]));
        assertArrayEquals(new Integer[]{10, 9}, zigzagLevelOrder.get(1)
                                                                .toArray(new Integer[0]));
        assertArrayEquals(zigzagLevelOrder.get(2).toArray(new Integer[0]),
                          new Integer[]{15, 7});
        assertThat(zigzagLevelOrder.size(), is(3));


        final TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        zigzagLevelOrderTraversal103.zigzagLevelOrder(
                root2);
    }
}