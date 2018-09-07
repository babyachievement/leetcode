package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/7 13:30
 */
public class FindModeInBSTTest {

    @Test
    public void findMode() {
        FindModeInBST findModeInBST = new FindModeInBST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        int[] mode = findModeInBST.findMode(root);

        assertArrayEquals(new int[]{2}, mode);
    }

    @Test
    public void findMode2() {
        FindModeInBST findModeInBST = new FindModeInBST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(2);
        int[] mode = findModeInBST.findMode(root);


        assertArrayEquals(new int[]{2}, mode);
    }
}