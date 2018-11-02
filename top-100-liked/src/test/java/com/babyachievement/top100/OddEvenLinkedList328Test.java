package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/2 14:03
 */
public class OddEvenLinkedList328Test {

    @Test
    public void oddEvenList() {
        final OddEvenLinkedList328 linkedList328 = new OddEvenLinkedList328();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newHead = linkedList328.oddEvenList(head);
        assertThat(newHead.val, is(1));
        assertThat(newHead.next.val, is(3));
        assertThat(newHead.next.next.val, is(5));
        assertThat(newHead.next.next.next.val, is(2));
        assertThat(newHead.next.next.next.next.val, is(4));
        assertNull(newHead.next.next.next.next.next);

        final ListNode listNode = linkedList328.oddEvenList(new ListNode(1));
        assertNull(listNode.next);
        assertThat(listNode.val, is(1));

        assertNull(linkedList328.oddEvenList(null));
    }
}