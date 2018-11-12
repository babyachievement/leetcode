package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/partition-list/description/
 */
public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode current = head;
        ListNode currentPre = null;

        while (current != null) {
            ListNode next = current.next;
            if (current.val < x) {
                if (null != currentPre) {
                    currentPre.next = next;
                }

                if(pre.next!=current) {
                    current.next = pre.next;
                    pre.next = current;
                }
                pre = pre.next;
            } else {
                currentPre = current;
            }

            current = next;
        }



        return preHead.next;

    }
}
