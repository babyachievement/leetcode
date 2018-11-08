package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;
import org.babyachievement.algorithms.structure.utils.LinkListUtils;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/8 13:38
 */
public class ReverseLinkedListII92Test {

    @Test
    public void reverseBetween() {
        final ReverseLinkedListII92 reverseLinkedListII92 = new ReverseLinkedListII92();
        final ListNode head = LinkListUtils.buildListNod(
                new int[]{1, 2, 3, 4, 5});

        final ListNode listNode = reverseLinkedListII92.reverseBetween(head,
                                                                       2,
                                                                       4);

        assertThat(listNode.val, is(1));
        assertThat(listNode.next.val, is(4));
        assertThat(listNode.next.next.val, is(3));
        assertThat(listNode.next.next.next.val, is(2));
        assertThat(listNode.next.next.next.next.val, is(5));
    }
}