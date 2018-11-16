/**
 * date: 2018/11/16 9:56
 */

package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths/description/
 */
public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode root, String str, List<String> result) {
        if (root == null) {
            return;
        }

        String prefix = str.isEmpty() ? str : str + "->";
        if (root.left == null && root.right == null) {
            result.add(prefix + root.val);
            return;
        }

        dfs(root.left, prefix+root.val, result);
        dfs(root.right, prefix+root.val, result);

    }
}
