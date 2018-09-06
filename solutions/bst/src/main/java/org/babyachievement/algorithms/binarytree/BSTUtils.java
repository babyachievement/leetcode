/**
 * date: 2018/9/6 10:23
 */

package org.babyachievement.algorithms.binarytree;

import java.util.List;

public class BSTUtils {

    public static boolean compareBSTS(TreeNode one, TreeNode another) {
        if (one == null && another != null) {
            return false;
        }

        if (another == null && one != null) {
            return false;
        }

        if (one == null && another == null) {
            return true;
        }

        if (one.val != another.val) {
            return false;
        }

        // compare left and right
        return compareBSTS(one.left, another.left)
                && compareBSTS(one.right, another.right);
    }

    public static boolean contains(TreeNode tree, List<TreeNode> treeNodes) {
        if (tree == null) {
            return false;
        }

        if (treeNodes == null) {
            return false;
        }

        for (TreeNode treeNode : treeNodes) {
            if (compareBSTS(tree, treeNode)) {
                return true;
            }
        }

        return false;
    }
}
