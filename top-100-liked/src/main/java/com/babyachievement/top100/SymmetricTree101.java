/**
 * date: 2018/9/28 16:58
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/description/
 */
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root.left, root.right);

    }

    boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && isSymmetric(left.left, right.right) &&
                isSymmetric(left.right, right.left);
    }


}
