package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/7 16:31
 */
public class RecoverBSTTest {

    @Test
    public void recoverTree() {
        RecoverBST recoverBST = new RecoverBST();
        // [1,3,null,null,2]

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        recoverBST.recoverTree(root);
        assertThat(root.val, is(3));
        assertThat(root.left.val, is(1));
        assertThat(root.left.right.val, is(2));
    }

    @Test
    public void recoverTree2() {
        RecoverBST recoverBST = new RecoverBST();
        // [1,3,null,null,2]

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2);

        recoverBST.recoverTree(root);
        assertThat(root.val, is(2));
        assertThat(root.left.val, is(1));
        assertThat(root.right.val, is(4));
        assertThat(root.right.left.val, is(3));
    }
}