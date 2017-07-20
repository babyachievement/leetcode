/**
 * FileName:MergeTwoSortedLists
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午11:03
 */
package com.babyachievement.solutions_21;

public class MergeTwoSortedLists2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        }

        ListNode newList = new ListNode(0);
        ListNode current = newList;

        while (true) {
            if (l1 == null) {
                current.next = l2;
                return newList.next;
            } else if (l2 == null) {
                current.next = l1;
                return newList.next;
            } else if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            } else {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }
        }
    }
}
