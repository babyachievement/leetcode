/**
 * date: 2018/9/18 16:56
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast && fast != null) {
            slow = slow.next;

            if(fast.next!=null) {
                fast = fast.next.next;
            }else {
                fast = null;
            }
        }

        if (slow == fast && fast != null) {
            return true;
        }
        return false;
    }
}
