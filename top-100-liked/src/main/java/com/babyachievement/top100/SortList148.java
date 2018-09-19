/**
 * date: 2018/9/19 14:28
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

public class SortList148 {
    /**
     * merge sort
     *
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    ListNode sortList(ListNode head, ListNode tail) {
        if (head == null || head == tail) {
            return head;
        }


        ListNode slow = head;
        ListNode fast = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        final ListNode rightStart = slow.next;
        if (slow != null)
            slow.next = null;
        final ListNode left  = sortList(head, slow);
        final ListNode right = sortList(rightStart, tail);


        return mergeLinkList(left, right);
    }

    private ListNode mergeLinkList(ListNode head1, ListNode head2) {
        if (null == head1) {
            return head2;
        }
        if (null == head2) {
            return head1;
        }

        ListNode current1 = head1;
        ListNode current2 = head2;

        ListNode head    = new ListNode(Integer.MIN_VALUE);
        ListNode current = head;

        while (current1 != null && current2 != null) {
            if (current1.val > current2.val) {
                current.next = current2;
                current2 = current2.next;
            } else {
                current.next = current1;
                current1 = current1.next;
            }
            current = current.next;
        }

        if (current1 != null) {
            current.next = current1;
        }

        if (current2 != null) {
            current.next = current2;
        }

        return head.next;
    }
}
