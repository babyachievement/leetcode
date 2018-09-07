package org.babyachievement.algorithms.binarytree;

import org.babyachievement.algorithms.structure.ListNode;
import org.babyachievement.algorithms.structure.TreeNode;
import org.junit.Test;

/**
 * date: 2018/9/6 9:34
 */
public class SortListToBalancedBinaryTreeTest {

    @Test
    public void sortedListToBST() {
        ListNode head = buildSortList(new int[]{-10, -3, 0, 5, 9});
        printList(head);
        TreeNode roootNode = new SortListToBalancedBinaryTree().sortedListToBST(
                head);

        inOrderTravel(roootNode);
        System.out.println();
    }

    @Test
    public void testSortedListToBst2() {
        ListNode head = buildSortList(new int[]{-10, -3, 0, 5, 9});
        printList(head);
        TreeNode roootNode = new SortListToBalancedBinaryTree()
                .sortedListToBST2(head);

        inOrderTravel(roootNode);
        System.out.println();
    }

    private static void inOrderTravel(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrderTravel(treeNode.left);
        System.out.print(treeNode.val);
        System.out.print(" ");
        inOrderTravel(treeNode.right);
    }

    private static ListNode buildSortList(int[] nums) {
        if (nums == null) {
            return null;
        }

        ListNode head = null;
        ListNode pre = null;
        ListNode current;

        for (int num : nums) {
            if (head == null) {
                head = new ListNode(num);
                pre = head;
            } else {
                current = new ListNode(num);
                pre.next = current;
                pre = current;
            }
        }

        return head;
    }

    private static void printList(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val);
            System.out.print(" ");
            node = node.next;
        }

        System.out.println();
    }
}