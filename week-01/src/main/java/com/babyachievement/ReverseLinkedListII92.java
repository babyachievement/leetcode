/**
 * date: 2018/11/8 13:37
 */

package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/description/
 */
public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n) {
            return head;
        }

        ListNode newHead = new ListNode(1);
        newHead.next = head;

        ListNode leftPre = newHead;
        ListNode current = head;

        int i = 1;
        while (current != null && i < m) {
            leftPre = current;
            current = current.next;
            i++;
        }

        if (current == null) {
            return newHead.next;
        }


        ListNode currentHead = current;

        ListNode temp = null;
        while (i < n && current != null && current.next != null) {
            temp = current.next.next;




            current.next.next = currentHead;
            currentHead = current.next;
            current.next = temp;

            i++;
        }

        leftPre.next = currentHead;

        return newHead.next;
    }
}
