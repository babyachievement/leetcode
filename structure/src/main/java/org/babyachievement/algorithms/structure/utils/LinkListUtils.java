/**
 * date: 2018/11/6 17:38
 */

package org.babyachievement.algorithms.structure.utils;

import org.babyachievement.algorithms.structure.ListNode;

public abstract class LinkListUtils {
    public static ListNode buildListNod(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ListNode head = new ListNode(nums[0]);

        ListNode pre = head;
        for (int i = 1; i < nums.length; i++) {
            pre.next = new ListNode(nums[i]);
            pre = pre.next;
        }

        return head;
    }
}
