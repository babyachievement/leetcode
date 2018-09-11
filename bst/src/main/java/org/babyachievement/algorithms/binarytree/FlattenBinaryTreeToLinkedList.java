package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
 */
public class FlattenBinaryTreeToLinkedList {
    TreeNode pre;
    /**
     * 使用先序访问
     *
     * @param root
     */
    public void flatten(TreeNode root) {
        preOrderTravesal(root);
    }

    public TreeNode preOrderTravesal(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;


        if(null!=pre) {
            pre.right = root;
        }
        pre = root;

        preOrderTravesal(left);
        root.left = null;
        preOrderTravesal(right);

        return root;
    }

    private TreeNode rootNode;
    public void flatten2(TreeNode root) {
        if(root == null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = rootNode;
        root.left = null;
        rootNode = root;
    }
}
