/**
 * date: 2018/9/18 17:07
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
public class LinkedListCycleII {
    //                  a        b
//         start ------->-------->meeting
//                      |         |
//                      <----------
//                           c
//         assume fast and slow meets at k steps
//         k=a+b+r1(b+c) slow runs r1 cycles
//         2k=a+b+r2(b+c) fast runs r2 cycles
//         2k=a+b+r2(b+c)=2a+2b+2r1(b+c)
//         (b+c)(r2-2r1)=a+b => (b+c)n=a+b
//         a=(n-1)b+nc=(n-1)(b+c)+c
// 也就是说从起始位置到环开始的位置等于slow和fast相遇的位置再移动c个位置加上(n-1)圈
// moves a
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

}
