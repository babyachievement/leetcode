/**
 * date: 2018/9/11 16:17
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/maximum-binary-tree/description/
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) {
            return null;
        }
        TreeNode treeNode = null;

        for (int i = 0; i < nums.length; i++) {
            treeNode = insertIntoTreeNode(treeNode, nums[i]);
        }
        return treeNode;
    }

    public TreeNode insertIntoTreeNode(TreeNode treeNode, int num) {
        if (treeNode == null) {
            return new TreeNode(num);
        }
        if (treeNode.val < num) {
            TreeNode root = new TreeNode(num);
            root.left = treeNode;
            return root;
        } else {
            if (treeNode.right == null) {
                treeNode.right = new TreeNode(num);
            } else {
                treeNode.right = insertIntoTreeNode(treeNode.right, num);
            }

            return treeNode;
        }
    }

    public TreeNode constructMaximumBinaryTree2(int[] nums) {
        if (nums == null) {
            return null;
        }
        TreeNode root = null;

        for (int i = 0; i < nums.length; i++) {
            TreeNode treeNode = new TreeNode(nums[i]);
            if (root == null) {
                root = treeNode;
                continue;
            }
            if (root.val < nums[i]) {
                treeNode.left = root;
                root = treeNode;
            } else {
                TreeNode pre = root;
                TreeNode current = root.right;
                while (current != null && current.val > nums[i]) {
                    pre = current;
                    current = current.right;
                }

                pre.right = treeNode;
                treeNode.left = current;
            }
        }
        return root;
    }
}
