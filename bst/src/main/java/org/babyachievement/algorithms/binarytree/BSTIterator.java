/**
 * date: 2018/9/7 14:53
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;
import org.babyachievement.algorithms.structure.utils.BSTUtils;

public class BSTIterator {

    private TreeNode iterCurrent;

    public BSTIterator(TreeNode root) {
        build(root);

        if (root != null) {
            iterCurrent = root;
            while (iterCurrent.left != null) {
                iterCurrent = iterCurrent.left;
            }
        }
    }

    private void build(TreeNode root) {

        if (root == null) {
            return;
        }

        build(root.left);
        build(root.right);

        TreeNode treeNode = BSTUtils.rightMostOfLeftSubTree(root);
        if (null != treeNode) {
            treeNode.right = root;
        }

        root.right = BSTUtils.leftMostOfRightSubTree(root);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return iterCurrent != null;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        int val = iterCurrent.val;
        iterCurrent = iterCurrent.right;
        return val;
    }
}
