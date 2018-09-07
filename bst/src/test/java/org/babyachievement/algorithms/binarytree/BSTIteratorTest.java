package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/7 15:23
 */
public class BSTIteratorTest {

    @Test
    public void next() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(4);
        treeNode.left.left = new TreeNode(1);

        BSTIterator bstIterator = new BSTIterator(treeNode);

        assertTrue(bstIterator.hasNext());
        assertThat(bstIterator.next(), is(1));
        assertTrue(bstIterator.hasNext());
        assertThat(bstIterator.next(), is(2));
        assertTrue(bstIterator.hasNext());
        assertThat(bstIterator.next(), is(3));
        assertTrue(bstIterator.hasNext());
        assertThat(bstIterator.next(), is(4));

    }
}