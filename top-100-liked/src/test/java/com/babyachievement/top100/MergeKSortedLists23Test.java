package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/8 15:27
 */
public class MergeKSortedLists23Test {

    @Test
    public void mergeKLists() {
        final MergeKSortedLists23 mergeKSortedLists23 = new MergeKSortedLists23();
        final ListNode            listNode1           = new ListNode(1);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(5);

        final ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        final ListNode listNode3 = new ListNode(2);
        listNode3.next = new ListNode(6);

        final ListNode listNode = mergeKSortedLists23.mergeKLists(new ListNode[]{listNode1, listNode2,
                listNode3});

        assertThat(listNode.val, is(1));
        assertThat(listNode.next.val, is(1));
        assertThat(listNode.next.next.val, is(2));
        assertThat(listNode.next.next.next.val, is(3));
    }
}