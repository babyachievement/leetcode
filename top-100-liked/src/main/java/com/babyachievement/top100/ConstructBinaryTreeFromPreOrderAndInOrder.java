/**
 * date: 2018/9/18 14:42
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 */
public class ConstructBinaryTreeFromPreOrderAndInOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder
                .length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        if (inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);

        int inOrderIndex = findIndex(preorder[preStart], inStart, inorder);


        final int leftPreENd = preStart + inOrderIndex - inStart;
        root.left = buildTree(preorder, preStart + 1, leftPreENd, inorder,
                              inStart, inOrderIndex);
        root.right = buildTree(preorder, leftPreENd + 1, preEnd, inorder,
                               inOrderIndex + 1, inEnd);

        return root;
    }

    int findIndex(int v, int start, int[] nums) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == v) {
                return i;
            }
        }

        return -1;
    }
}
