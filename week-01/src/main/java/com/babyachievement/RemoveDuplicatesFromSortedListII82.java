package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
 */
public class RemoveDuplicatesFromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode current = head;
        ListNode pre     = newHead;

        while (current != null) {
            boolean shouldRemove = false;
            while (current.next != null && current.val == current.next.val) {
                current = current.next;
                shouldRemove = true;
            }

            if (!shouldRemove) {
                pre.next = current;
                pre = pre.next;
            }

            current = current.next;
        }
        pre.next = null;
        return newHead.next;
    }
}
