/**
 * date: 2018/11/2 14:38
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
 */
public class KthSmallestElementInaBST230 {
    public int kthSmallest(TreeNode root, int k) {
        return find(root, k, new int[1]).val;
    }

    public TreeNode find(TreeNode root, int k, int[] v) {
        if (root == null) {
            return null;
        }

        TreeNode treeNode = find(root.left, k, v);
        if (treeNode != null) {
            return treeNode;
        }
        v[0] = v[0] + 1;
        if (v[0] == k) {
            return root;
        }

        return find(root.right, k, v);
    }
}
