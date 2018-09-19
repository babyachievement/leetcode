package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/19 15:14
 */
public class SortList148Test {

    @Test
    public void sortList() {
        final SortList148 sortList148 = new SortList148();
        final ListNode    head    = new ListNode(4);
        head.next =  new ListNode(2);
        head.next.next =  new ListNode(1);
        head.next.next.next =  new ListNode(3);

        final ListNode listNode = sortList148.sortList(head);
        assertThat(listNode.val, is(1));
        assertThat(listNode.next.val, is(2));
        assertThat(listNode.next.next.val, is(3));
        assertThat(listNode.next.next.next.val, is(4));
        assertNull(listNode.next.next.next.next);
    }
}