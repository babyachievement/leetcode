/**
 * date: 2018/9/6 10:23
 */

package org.babyachievement.algorithms.structure.utils;

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


    public static int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }

    public static void printInOrderBST(TreeNode root) {
        if (root == null) {
            return;
        }

        printInOrderBST(root.left);
        System.out.println(root.val);
        printInOrderBST(root.right);
    }

    public static void printPreOrderBST(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val);
        printPreOrderBST(root.left);
        printPreOrderBST(root.right);
    }

    public static TreeNode listToTree(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        return level(list, 0);
    }


    private static TreeNode level(List<Integer> list, int index) {
        if ( index>= list.size()||null == list.get(index)) {
            return null;
        }
        final TreeNode treeNode = new TreeNode(list.get(index).intValue());
        treeNode.left = level(list, 2 * index + 1);
        treeNode.right = level(list, 2 * index + 2);
        return treeNode;
    }
}
