/**
 * date: 2018/10/8 15:27
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class MergeKSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        final ListNode[] currentPs = new ListNode[lists.length];

        ListNode head    = null;
        ListNode current = null;

        for (int i = 0; i < currentPs.length; i++) {
            currentPs[i] = lists[i];
        }

        int minVIndex = getMinVIndex(currentPs);


        head = currentPs[minVIndex];
        current = head;
        currentPs[minVIndex] = current.next;

        while ((minVIndex = getMinVIndex(currentPs)) != -1) {
            current.next = currentPs[minVIndex];
            currentPs[minVIndex] = currentPs[minVIndex].next;
            current = current.next;
        }

        return head;
    }

    private int getMinVIndex(ListNode[] currentPs) {
        int min      = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < currentPs.length; i++) {
            if (currentPs[i] == null) {
                continue;
            }

            if (currentPs[i].val < min) {
                min = currentPs[i].val;
                minIndex = i;
            }
        }


        return minIndex;
    }

    /**
     * 使用分治法
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists2(ListNode[] lists) {
        return mergeKSortedLists(lists, 0, lists.length - 1);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeKSortedLists(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];

        if (start <= end) {
            int      mid = (start + end) / 2;
            ListNode l1  = mergeKSortedLists(lists, start, mid);
            ListNode l2  = mergeKSortedLists(lists, mid + 1, end);
            return mergeTwoLists(l1, l2);
        }

        return null;
    }
}
