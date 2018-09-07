/**
 * date: 2018/9/7 14:17
 */

package org.babyachievement.algorithms.binarytree;

public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        TreeNode result;
        if ((result = searchBST(root.left, val)) != null) {
            return result;
        }

        return searchBST(root.right, val);
    }

    public TreeNode searchBSTIter(TreeNode root, int val) {
        while (root != null && root.val != val) {
            if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return root;
    }
}
