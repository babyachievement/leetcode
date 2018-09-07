/**
 * date: 2018/9/6 10:23
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

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


    public static TreeNode rightMostOfLeftSubTree(TreeNode treeNode) {
        if (treeNode.left != null) {
            TreeNode pre = treeNode.left;
            while (pre.right != null) {
                pre = pre.right;
            }
            return pre;
        } else {
            return null;
        }
    }

    public static TreeNode leftMostOfRightSubTree(TreeNode treeNode) {
        if (treeNode.right != null) {
            TreeNode pre = treeNode.right;
            while (pre.left != null) {
                pre = pre.left;
            }
            return pre;
        } else {
            return null;
        }
    }

}
