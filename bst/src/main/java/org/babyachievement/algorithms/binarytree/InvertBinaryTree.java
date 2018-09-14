package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/invert-binary-tree/description/
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode left  = root.left;
        TreeNode right = root.right;

        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
