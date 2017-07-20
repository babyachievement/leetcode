/**
 * FileName:MergeTwoSortedLists
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午11:03
 */
package com.babyachievement.solutions_21;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        }

        ListNode l1Current = l1;
        ListNode l2Current = l2;
        ListNode newList;
        ListNode current;

        if (l1.val <= l2.val) {
            newList = l1;
            l1Current = l1Current.next;
        } else {
            newList = l2;
            l2Current = l2Current.next;
        }

        current = newList;
        while (l1Current != null && l2Current != null) {
            if (l1Current.val <= l2Current.val) {
                current.next = l1Current;
                l1Current = l1Current.next;
            } else {
                current.next = l2Current;
                l2Current = l2Current.next;
            }
            current = current.next;
        }

        if (l1Current != null) {
            current.next = l1Current;
        }

        if (l2Current != null) {
            current.next = l2Current;
        }

        return newList;
    }
}
