/**
 * date: 2018/9/28 15:26
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/description/
 */
public class SubtreeOfAnotherTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (treeEqual(s, t)) {
            return true;
        } else if (s != null) {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        } else {
            return false;
        }
    }

    private boolean treeEqual(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s != null && t != null) {
            return s.val == t.val && treeEqual(s.left, t.left)
                    && treeEqual(s.right, t.right);
        } else {
            return false;
        }
    }
}
