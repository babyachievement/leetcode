/**
 * date: 2018/9/10 14:42
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

public class InsertIntoaBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode pre = null;
        TreeNode current = root;
        while (current != null) {
            if (val < current.val) {
                pre = current;
                current = current.left;
            } else if (val > current.val) {
                pre = current;
                current = current.right;
            }
        }

        if (pre != null) {
            if (pre.val < val) {
                pre.right = new TreeNode(val);
            } else {
                pre.left = new TreeNode(val);
            }
            return root;
        } else {
            return new TreeNode(val);
        }
    }
}
