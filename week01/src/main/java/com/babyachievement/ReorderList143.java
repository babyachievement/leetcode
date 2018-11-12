package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/reorder-list/description/
 */
public class ReorderList143 {
    public void reorderList(ListNode head) {
        if (null == head || head.next == null) {
            return;
        }

        ListNode slow = head;

        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow.next;
        slow.next = null;
        slow = head;

        LinkedList<ListNode> stack = new LinkedList<>();
        while (fast != null) {
            stack.addLast(fast);
            fast = fast.next;
        }

        while (true) {
            ListNode listNode = stack.pollLast();
            if (slow == listNode || listNode == null) {
                return;
            }

            ListNode next = slow.next;

            slow.next = listNode;
            listNode.next = next;

            slow = next;
        }
    }
}
