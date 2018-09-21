/**
 * date: 2018/9/21 10:34
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-linked-list/description/
 */
public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {

        ListNode       slow  = head, fast = head;
        List<ListNode> queue = new LinkedList<>();
        while (fast != null && fast.next != null) {
            queue.add(0, slow);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null && !queue.isEmpty()) {

            if (((LinkedList<ListNode>) queue).pollFirst().val
                    != slow.val)
                return false;
            else slow = slow.next;
        }

        return true;
    }


    ListNode h;
    public boolean isPalindromeRecursive(ListNode head) {
        if (head == null) return true;

        if (h == null) h = head;

        boolean tmp = true;
        if (head.next != null) tmp &= isPalindrome(head.next);

        tmp &= (head.val == h.val);
        h = h.next;
        return tmp;
    }
}
