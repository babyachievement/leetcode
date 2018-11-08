package com.babyachievement;

import org.babyachievement.algorithms.structure.TreeLinkNode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/
 */
public class PopulatingNextRightPointersInEachNodeII117 {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            root.left.next = root.right != null ? root.right : findNext(root.next);
        }

        if (root.right != null) {
            root.right.next = findNext(root.next);
        }

        connect(root.right);
        connect(root.left);

    }

    TreeLinkNode findNext(TreeLinkNode current) {
        if (current == null) {
            return null;
        }

        if (current.left != null) {
            return current.left;
        }

        if (current.right != null) {
            return current.right;
        }

        return findNext(current.next);
    }

    public void connect2(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        LinkedList<TreeLinkNode> queue = new LinkedList<>();
        TreeLinkNode pre = null;

        queue.addLast(root);
        queue.addLast(null);

        while (!queue.isEmpty()) {
            TreeLinkNode node = queue.pollFirst();

            if (null != pre) {
                pre.next = node;
                pre = pre.next;
            } else {
                pre = node;
            }

            if (null == node && !queue.isEmpty()) {
                queue.addLast(null);
            }

            if (null != node) {
                if (null != node.left) {
                    queue.addLast(node.left);
                }

                if (null != node.right) {
                    queue.addLast(node.right);
                }
            }
        }
    }


    public void connect3(TreeLinkNode root) {
        TreeLinkNode dummyHead = new TreeLinkNode(0);
        TreeLinkNode pre = dummyHead;
        while (root != null) {
            if (root.left != null) {
                pre.next = root.left;
                pre = pre.next;
            }
            if (root.right != null) {
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next;
            if (root == null) {
                pre = dummyHead;
                root = dummyHead.next;
                dummyHead.next = null;
            }
        }
    }


}
