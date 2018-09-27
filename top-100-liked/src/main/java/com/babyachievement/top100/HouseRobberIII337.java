/**
 * date: 2018/9/26 18:05
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/house-robber-iii/description/
 */
public class HouseRobberIII337 {

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        final int[] ints = postOrderDfs(root);
        return Math.max(ints[0], ints[1]);

    }

    // [0]: withCurrent,[1]:withoutCurrent
    private int[] postOrderDfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        final int[] result = new int[2];
        final int[] left   = postOrderDfs(root.left);
        final int[] right   = postOrderDfs(root.right);

        result[0] = left[1] + right[1] + root.val;
        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return result;
    }

    // return Math.max(rob(root, true), rob(root, false));
    public int rob(TreeNode root, boolean shouldSkip) {
        if (null == root) {
            return 0;
        }

        if (shouldSkip) {
            return rob(root.left, false) + rob(root.right, false);
        } else {
            return Math.max(root.val + rob(root.left, true) + rob(root.right,
                                                                  true),
                            rob(root.left, false) + rob(root.right, false));
        }
    }
}
