package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

/**
 * date: 2018/9/7 18:14
 */
public class ClosestBSTValueIITest {
    private TreeNode current;
    private double minSub = Double.MAX_VALUE;

    @Test
    public void closestKValues() {

    }

    private void findTheClosest(TreeNode root, double target) {
        if (root == null) {
            return;
        }

        findTheClosest(root.left, target);
        if (Math.abs(target - root.val) < minSub) {
            current = root;
            minSub = Math.abs(target - root.val);
        }

        findTheClosest(root.right, target);
    }
}