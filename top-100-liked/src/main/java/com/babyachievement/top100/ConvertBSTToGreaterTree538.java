/**
 * date: 2018/9/28 14:29
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 */
public class ConvertBSTToGreaterTree538 {
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }

        root.val += dfs(root.right, sum);

        return dfs(root.left, root.val);
    }
}
