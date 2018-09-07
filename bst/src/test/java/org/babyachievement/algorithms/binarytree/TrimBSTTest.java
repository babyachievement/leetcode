package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/7 14:42
 */
public class TrimBSTTest {

    @Test
    public void trimBST() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        TreeNode treeNode = new TrimBST().trimBST(root, 1, 3);

        assertEquals(treeNode, root);
        assertThat(treeNode.left.val, is(2));
        assertThat(treeNode.left.left.val, is(1));
    }
}