package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/18 17:41
 */
public class LinkedListCycleIITest {

    @Test
    public void detectCycle() {
        final LinkedListCycleII cycleII = new LinkedListCycleII();
        final ListNode          listNode = new ListNode(1);
        listNode.next = listNode;

        assertThat(cycleII.detectCycle(listNode), is(listNode));

        final ListNode          listNode2 = new ListNode(1);

        assertNull(cycleII.detectCycle(listNode2));

        final ListNode          listNode3 = new ListNode(1);
        listNode3.next = new ListNode(2);
        listNode3.next.next = new ListNode(3);
        listNode3.next.next.next = listNode3.next;

        assertThat(cycleII.detectCycle(listNode3), is(listNode3.next));

        final ListNode          listNode4 = new ListNode(1);
        listNode4.next = new ListNode(2);
        listNode4.next.next = listNode4;
        assertThat(cycleII.detectCycle(listNode4), is(listNode4));
    }
}