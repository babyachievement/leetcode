/**
 * date: 2018/9/7 14:53
 */

package org.babyachievement.algorithms.binarytree;

public class BSTIteratorMorrisTravel {

    private TreeNode current;

    public BSTIteratorMorrisTravel(TreeNode root) {
        current = root;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode pre;
        int ret = 0;
        while (current != null) {
            if (current.left == null) {
                ret = current.val;
                current = current.right;
                break;
            } else {
                pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    ret = current.val;
                    pre.right = null;
                    current = current.right;
                    break;
                }
            }
        }

        return ret;
    }
}
