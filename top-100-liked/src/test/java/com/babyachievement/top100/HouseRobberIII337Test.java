package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/27 10:53
 */
public class HouseRobberIII337Test {

    @Test
    public void rob() {
        final HouseRobberIII337 robberIII337 = new HouseRobberIII337();
        final TreeNode          root     = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        assertThat(robberIII337.rob(root), is(7));

        final TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(1);
        assertThat(robberIII337.rob(root2), is(9));

        final TreeNode root3 = new TreeNode(3);
        root3.left = new TreeNode(4);
        root3.right = new TreeNode(5);
        root3.left.left = new TreeNode(1);
        root3.left.right = new TreeNode(5);
        root3.right.right = new TreeNode(1);
        assertThat(robberIII337.rob(root3), is(11));
    }
}