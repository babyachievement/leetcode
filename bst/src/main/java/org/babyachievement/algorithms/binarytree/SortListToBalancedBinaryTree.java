/**
 * date: 2018/9/5 17:30
 */

package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.ListNode;
import org.babyachievement.algorithms.structure.TreeNode;

public class SortListToBalancedBinaryTree {
    ListNode head;

    public TreeNode sortedListToBST(ListNode head) {
        int n = countNodes(head);

        this.head = head;

        return bst(n);
    }

    public TreeNode bst(int n) {
        if (n <= 0) {
            return null;
        }

        TreeNode left = bst(n / 2);

        TreeNode treeNode = new TreeNode(head.val);

        treeNode.left = left;
        head = head.next;

        treeNode.right = bst(n - n / 2 - 1);

        return treeNode;
    }

    public int countNodes(ListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }

        return i;
    }

    public TreeNode sortedListToBST2(ListNode head) {
        return bst(head, null);
    }

    public TreeNode bst(ListNode head, ListNode tail) {
        // base case 1: there are no list nodes
        if (head == tail) {
            return null;
        }

        // base case 2: there is only one list node
        if (head.next == tail) {
            TreeNode root = new TreeNode(head.val);
            return root;
        }


        // recursion by find the middle list node with a one step and a two
        // steps reference skip, when the two steps reference reach the tail,
        // the one step reference should be the middle node, excellent！
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode treeNode = new TreeNode(slow.val);
        treeNode.left = bst(head, slow);
        treeNode.right = bst(slow.next, tail);

        return treeNode;
    }
}
