package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/8 14:56
 */
public class ConstructBtFromInorderAndPostorderTraversal106Test {

    @Test
    public void buildTree() {
        final ConstructBtFromInorderAndPostorderTraversal106 fromInorderAndPostorderTraversal106 = new ConstructBtFromInorderAndPostorderTraversal106();
        final TreeNode treeNode = fromInorderAndPostorderTraversal106.buildTree(
                new int[]{9, 3, 15, 20, 7},
                new int[]{9, 15, 7, 20, 3});


        assertThat(treeNode.val, is(3));
        assertThat(treeNode.left.val, is(9));
        assertNull(treeNode.left.left);
        assertNull(treeNode.left.right);

        assertThat(treeNode.right.val, is(20));
        assertThat(treeNode.right.left.val, is(15));
        assertThat(treeNode.right.right.val, is(7));


        fromInorderAndPostorderTraversal106.buildTree(new int[]{1, 2, 3}, new
                int[]{1, 3, 2});

    }
}