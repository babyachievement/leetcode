package com.babyachievement.solutions_2;

/**
 * 两数相加
 *
 * @user Alvin
 * @create 2017-07-20 21:50
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newList = new ListNode(0);

        int l1Len = getListLenth(l1);
        int l2Len = getListLenth(l2);

        if (l1Len > l2Len)
            newList.next = l1;
        else {
            newList.next = l2;
        }

        ListNode current = newList;
        int left = 0;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + left;
            current.next.val = sum % 10;
            left = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }

        while (current.next != null) {
            int sum = current.next.val + left;
            current.next.val = sum % 10;
            left = sum / 10;
            current = current.next;
        }

        if (left > 0) {
            current.next = new ListNode(left);
        }

        return newList.next;
    }


    public int getListLenth(ListNode l) {
        int i = 0;
        while (l != null) {
            i++;
            l = l.next;
        }

        return i;
    }
}
