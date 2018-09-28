/**
 * date: 2018/9/28 16:55
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/same-tree/description/
 */
public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right);
        }

        if (p == null && q == null) {
            return true;
        }

        return false;

    }
}
