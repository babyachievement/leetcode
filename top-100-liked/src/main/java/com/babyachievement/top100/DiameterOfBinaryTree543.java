/**
 * date: 2018/9/28 14:47
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class DiameterOfBinaryTree543 {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] max = {0};
        dfs(root, max);
        return max[0] - 1;
    }

    public int[] dfs(TreeNode root, int[] max) {
        final int[] result = new int[2];
        if (root == null) {
            return result;
        }


        final int[] left  = dfs(root.left, max);
        final int[] right = dfs(root.right, max);

        result[0] = 1 + left[1] + right[1];
        result[1] = 1 + Math.max(left[1], right[1]);

        max[0] = Math.max(max[0], Math.max(result[0], result[1]));
        return result;
    }

    public int diameterOfBinaryTree2(TreeNode root) {
        if (root == null) return 0;
        int[] max = {0};
        dfs2(root, max);
        return max[0];
    }

    private int dfs2(TreeNode root, int[] max) {
        if (root == null) return 0;
        int left  = dfs2(root.left, max);
        int right = dfs2(root.right, max);
        max[0] = Math.max(max[0], left + right);
        return Math.max(left, right) + 1;
    }
}
