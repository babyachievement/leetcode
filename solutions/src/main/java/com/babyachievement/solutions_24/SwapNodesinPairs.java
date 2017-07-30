/**
 * FileName:SwapNodesinPairs
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午11:08
 */
package com.babyachievement.solutions_24;


public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);

//        if (head != null) {
//            if (head.next == null) {
//                preHead.next = head;
//            } else {
//                preHead.next = head.next;
//            }
//        }

        ListNode pre = preHead;
        while (head != null) {
            ListNode next = head.next;
            if (next != null) {
                head.next = next.next;
                next.next = head;
                pre.next = next;
            } else {
                pre.next = head;
            }


            pre = head;
            head = head.next;
        }

        return preHead.next;
    }
}
