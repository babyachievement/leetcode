package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KthSmallestElementInaBST230Test {

    @Test
    public void kthSmallest() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestElementInaBST230 kthSmallestElementInaBST230 = new KthSmallestElementInaBST230();

        assertThat(kthSmallestElementInaBST230.kthSmallest(root, 1), is(1));

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(6);

        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(1);

        assertThat(kthSmallestElementInaBST230.kthSmallest(root2, 3), is(3));
    }
}