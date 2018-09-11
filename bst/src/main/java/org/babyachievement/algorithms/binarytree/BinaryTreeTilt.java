/**
 * date: 2018/9/11 15:21
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

public class BinaryTreeTilt {
    private int tilt = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return  tilt;
    }

    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sumLeft = sum(root.left);
        int sumRight = sum(root.right);
        tilt += Math.abs(sumLeft - sumRight);
        return root.val + sumLeft + sumRight;
    }

}
