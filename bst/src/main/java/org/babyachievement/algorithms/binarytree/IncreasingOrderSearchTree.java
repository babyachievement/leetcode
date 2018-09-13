/**
 * date: 2018/9/12 18:34
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/description/
 */
public class IncreasingOrderSearchTree {
    TreeNode pre;
    TreeNode newRoot;

    public TreeNode increasingBST(TreeNode root) {
        // return inOrder2(root, null);
         inOrderDfs(root);
        return newRoot;
    }

    void inOrderDfs(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderDfs(root.left);

        if (newRoot == null) {
            newRoot = root;
        }

        if (pre != null) {
            pre.left = null;
            pre.right = root;

        }

        root.left = null;
        pre = root;

        inOrderDfs(root.right);
    }

    /***
     * 可以将root看作null的左子节点
     * @param root
     * @param next
     * @return
     */
    TreeNode inOrder2(TreeNode root, TreeNode next) {
        if (root == null) {
            return next;
        }

        TreeNode pre = inOrder2(root.left, root);
        root.left = null;
        root.right = inOrder2(root.right, next);
        return pre;
    }


}
