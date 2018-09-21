/**
 * date: 2018/9/21 14:18
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 */
public class LowestCommonAncestorBinaryTree236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> pPath = new LinkedList<>();
        LinkedList<TreeNode> qPath = new LinkedList<>();

        path(root, p, pPath);
        path(root, q, qPath);

        TreeNode treeNode = null;
        while (pPath.peekFirst() == qPath.peekFirst()) {
            treeNode = pPath.pollFirst();
            qPath.pollFirst();
        }

        return treeNode;
    }

    private boolean path(TreeNode root, TreeNode p, List<TreeNode>
            result) {
        if (root == null) {
            return false;
        }
        if (root.val == p.val) {
            result.add(0, root);
            return true;
        }

        if (path(root.left, p, result) || path(root.right, p, result)) {
            result.add(0, root);
            return true;
        }

        return false;
    }
}
