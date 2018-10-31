/**
 * date: 2018/10/31 13:36
 */

package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.ListNode;

/**
 *
 */
public class DeleteNodeInLinkedList237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
