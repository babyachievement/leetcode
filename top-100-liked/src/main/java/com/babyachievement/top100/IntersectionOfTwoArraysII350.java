/**
 * date: 2018/10/31 17:13
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 */
public class IntersectionOfTwoArraysII350 {

    public int[] intersect2(int[] nums1, int[] nums2) {
        final int[] temp = new int[nums1.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int c = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                temp[c++] = nums1[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(temp, c);

    }

    ListNode head;

    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        if (nums1.length < nums2.length) {
            head = constructList(nums2);
            int         count  = 0;
            final int[] result = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                final ListNode listNode = removeNode(nums1[i]);
                if (listNode != null) {
                    result[count++] = listNode.val;
                }
            }

            if (count == 0) {
                return new int[0];
            } else {
                final int[] ints = new int[count];
                System.arraycopy(result, 0, ints, 0, count);
                return ints;
            }

        } else {
            head = constructList(nums1);
            int         count  = 0;
            final int[] result = new int[nums2.length];
            for (int i = 0; i < nums2.length; i++) {
                final ListNode listNode = removeNode(nums2[i]);
                if (listNode != null) {
                    result[count++] = listNode.val;
                }
            }

            if (count == 0) {
                return new int[0];
            } else {
                final int[] ints = new int[count];
                System.arraycopy(result, 0, ints, 0, count);
                return ints;
            }
        }
    }

    ListNode constructList(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode pre  = head;

        for (int i = 1; i < nums.length; i++) {
            final ListNode listNode = new ListNode(nums[i]);
            pre.next = listNode;
            pre = pre.next;
        }

        return head;
    }

    ListNode removeNode(int v) {

        ListNode current = head;
        ListNode pre     = head;

        while (current != null && current.val != v) {
            pre = current;
            current = current.next;
        }

        if (current == null) {
            return null;
        }

        if (current == head) {
            head = head.next;
        } else {
            pre.next = current.next;
        }

        return current;
    }
}
