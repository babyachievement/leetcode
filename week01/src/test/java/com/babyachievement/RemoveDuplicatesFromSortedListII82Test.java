package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;
import org.babyachievement.algorithms.structure.utils.LinkListUtils;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/6 17:38
 */
public class RemoveDuplicatesFromSortedListII82Test {

    @Test
    public void deleteDuplicates() {
        final RemoveDuplicatesFromSortedListII82 removeDuplicates = new
                RemoveDuplicatesFromSortedListII82();
        final ListNode listNode1 = LinkListUtils.buildList(new int[]{1, 2,
                3, 3, 4, 4, 5});

        final ListNode newHead1 = removeDuplicates.deleteDuplicates(listNode1);
        assertThat(newHead1.val, is(1));
        assertThat(newHead1.next.val, is(2));
        assertThat(newHead1.next.next.val, is(5));
        assertNull(newHead1.next.next.next);

        final ListNode listNode2 = LinkListUtils.buildList(new int[]{1, 1, 1, 2, 3});
        final ListNode newHead2  = removeDuplicates.deleteDuplicates(listNode2);
        assertThat(newHead2.val, is(2));

        assertNull(removeDuplicates.deleteDuplicates(LinkListUtils.buildList(
                new int[]{1, 1})));
        final ListNode listNode3 = removeDuplicates.deleteDuplicates(
                LinkListUtils.buildList(new int[]{1, 2, 2}));
        assertThat(listNode3.val, is(1));
        assertNull(listNode3.next);

    }


}