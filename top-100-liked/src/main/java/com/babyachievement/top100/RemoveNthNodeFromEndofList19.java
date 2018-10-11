/**
 * date: 2018/10/11 11:01
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class RemoveNthNodeFromEndofList19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }

        if (current == null) {
            return head.next;
        }


        ListNode pre     = new ListNode(0);
        pre.next = head;
        while (current != null) {
            pre = pre.next;
            current = current.next;
        }

        pre.next = pre.next.next;
        return head;
    }
}
