/**
 * date: 2018/9/7 16:23
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.TreeNode;

public class RecoverBST {
    private TreeNode firstInvalidNode;
    private TreeNode lastInvalidNode;
    private TreeNode pre = new TreeNode(Integer.MIN_VALUE);


    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }

        findInvalidNode(root);
        if (firstInvalidNode != null && lastInvalidNode != null) {
            System.out.println("Swap");
            int temp = firstInvalidNode.val;
            firstInvalidNode.val = lastInvalidNode.val;
            lastInvalidNode.val = temp;
        }
    }

    /**
     * pre 是比中序遍历的上个节点，找到第一个和最后一个非法节点
     *
     * @param root
     */
    public void findInvalidNode(TreeNode root) {
        if (root == null) {
            return;
        }
        findInvalidNode(root.left);

        if (root.val < pre.val) {
            if (null == firstInvalidNode) {
                firstInvalidNode = pre;
            }
            lastInvalidNode = root;
        }

        pre = root;
        findInvalidNode(root.right);
    }
}
