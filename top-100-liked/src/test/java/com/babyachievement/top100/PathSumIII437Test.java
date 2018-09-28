package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 9:57
 */
public class PathSumIII437Test {

    @Test
    public void pathSum() {
        final PathSumIII437 pathSumIII437 = new PathSumIII437();
        final TreeNode      root      = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        root.right.right = new TreeNode(11);
        assertThat(pathSumIII437.pathSum(root, 8), is(3));

        final TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.right.right = new TreeNode(3);
        root2.right.right.right = new TreeNode(4);
        root2.right.right.right.right = new TreeNode(5);

        assertThat(pathSumIII437.pathSum(root2, 3), is(2));

        final TreeNode root3 = new TreeNode(-8);
        root3.left = new TreeNode(6);
        root3.right = new TreeNode(8);
        root3.right.right = new TreeNode(2);
        root3.right.left = new TreeNode(8);
        root3.right.right.right = new TreeNode(-2);
        assertThat(pathSumIII437.pathSum(root3, -2), is(2));
    }
}