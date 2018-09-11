package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/11 15:51
 */
public class BinaryTreeTiltTest {

    @Test
    public void findTilt() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.right.left = new TreeNode(5);

        assertThat(new BinaryTreeTilt().findTilt(treeNode), is(11));
        // [1,2,3,4,null,5]
    }
}