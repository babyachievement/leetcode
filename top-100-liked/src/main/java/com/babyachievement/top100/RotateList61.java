package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        ListNode pre = null;
        ListNode tail = head;

        int count = 1;

        while (tail != null && tail.next != null) {
            count++;
            tail = tail.next;
        }

        int f = k % count;

        if (f == 0) {
            return head;
        }

        tail = head;
        count = 1;
        while (count < f +1 ) {
            tail = tail.next;
            count++;
        }

        pre = head;


        while (tail != null && tail.next != null) {
            pre = pre.next;
            tail = tail.next;
        }



        ListNode t = pre.next;
        pre.next = null;
        tail.next = head;
        return t;

    }
}
