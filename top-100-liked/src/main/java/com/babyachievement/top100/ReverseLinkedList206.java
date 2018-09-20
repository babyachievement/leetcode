/**
 * date: 2018/9/20 17:14
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList206 {

    public ListNode reverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode temp;
        while (current.next != null) {
            temp = current.next;

            current.next = pre;
            pre = current;
            current = temp;
        }

        current.next = pre;

        return current;
    }
}
