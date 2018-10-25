/**
 * date: 2018/10/25 10:22
 */

package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.TreeLinkNode;

/**
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
 */
public class PopulatingNextRightPointers116 {
    public void connect(TreeLinkNode root) {
        if (root == null || root.left == null) {
            return;
        }
        root.left.next = root.right;

        if (root.next != null)
            root.right.next = root.next.left;

        connect(root.left);
        connect(root.right);
    }

}
