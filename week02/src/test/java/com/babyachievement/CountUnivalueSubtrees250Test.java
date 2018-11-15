package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * date: 2018/11/15 17:01
 */
public class CountUnivalueSubtrees250Test {

    @Test
    public void countUnivalSubtrees() {
        final TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        final CountUnivalueSubtrees250 univalueSubtrees250 = new CountUnivalueSubtrees250();
        assertThat(univalueSubtrees250.countUnivalSubtrees(root), is(1));
    }
}