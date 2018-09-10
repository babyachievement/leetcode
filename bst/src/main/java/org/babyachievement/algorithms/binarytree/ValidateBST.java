/**
 * date: 2018/9/10 10:36
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {

        // morris 中序遍历验证

        TreeNode pre;
        TreeNode current = root;
        long preValue = Long.MIN_VALUE;
        boolean result = true;
        while (current != null) {
            if (current.left == null) {
                if(current==null)
                    continue;
                if (preValue >= current.val) {
                    result = false;
                    break;
                }else {
                    preValue = current.val;
                }
                current = current.right;

            } else {
                pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    if (preValue >= current.val) {
                        result = false;
                        break;
                    }else {
                        preValue = current.val;
                    }
                    pre.right = null;
                    current = current.right;
                }
            }
        }

        return result;

    }

}
