/**
 * date: 2018/11/2 14:02
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/odd-even-linked-list/description/
 */
public class OddEvenLinkedList328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;
        ListNode odd     = null;
        ListNode even     = null;
        ListNode temp;


        while (current != null) {
            temp = current.next;
            if (odd == null) {
                odd = current;
                even = temp;
            } else if (null != odd) {
                if(even!=null) {
                    even.next = current.next;
                    even = even.next;
                }
                current.next = odd.next;
                odd.next = current;
                odd = odd.next;
            }

            if (temp != null) {
                current = temp.next;
            } else {
                current = null;
            }
        }

        return head;
    }
}
