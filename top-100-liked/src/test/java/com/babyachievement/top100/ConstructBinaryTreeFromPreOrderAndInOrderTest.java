package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * date: 2018/9/18 15:29
 */
public class ConstructBinaryTreeFromPreOrderAndInOrderTest {

    @Test
    public void buildTree() {
        final ConstructBinaryTreeFromPreOrderAndInOrder constructor = new ConstructBinaryTreeFromPreOrderAndInOrder();

        final TreeNode treeNode = constructor.buildTree(new int[]{3, 9, 20, 15, 7},
                                                        new int[]{9, 3, 15, 20, 7});

        assertThat(treeNode.val, is(3));

        final TreeNode node = constructor.buildTree(new int[]{3, 2, 1, 4},
                                                    new int[]{1, 2, 3, 4});
        assertThat(node.val, is(3));
        assertThat(node.left.val, is(2));
        assertThat(node.right.val, is(4));
    }
}