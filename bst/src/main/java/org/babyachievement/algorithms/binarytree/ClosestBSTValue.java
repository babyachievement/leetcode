/**
 * date: 2018/9/7 18:11
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

public class ClosestBSTValue {
    private TreeNode current;
    private double minSub = Double.MAX_VALUE;

    /**
     * @param root:   the given BST
     * @param target: the given target
     * @return: the value in the BST that is closest to the target
     */
    public int closestValue(TreeNode root, double target) {
        findTheClosest(root, target);

        return current.val;
        // write your code here
    }

    private void findTheClosest(TreeNode root, double target) {
        if (root == null) {
            return;
        }

        findTheClosest(root.left, target);
        if (Math.abs(target - root.val) < minSub) {
            current = root;
            minSub = Math.abs(target - root.val);
        }

        findTheClosest(root.right, target);
    }
}
