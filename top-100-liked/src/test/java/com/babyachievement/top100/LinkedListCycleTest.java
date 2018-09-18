package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * date: 2018/9/18 16:59
 */
public class LinkedListCycleTest {

    @Test
    public void hasCycle() {
        final LinkedListCycle linkedListCycle = new LinkedListCycle();
        final ListNode        listNode        = new ListNode(1);
        listNode.next = listNode;

        assertTrue(linkedListCycle.hasCycle(listNode));

        ListNode        head2        = new ListNode(1);
        assertFalse(linkedListCycle.hasCycle(head2));
        ListNode        head3        = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = head3;

        assertTrue(linkedListCycle.hasCycle(head3));


    }
}