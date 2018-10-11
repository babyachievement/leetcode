package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/11 11:05
 */
public class RemoveNthNodeFromEndofList19Test {

    @Test
    public void removeNthFromEnd() {
        final RemoveNthNodeFromEndofList19 removeNthNodeFromEndofList19 = new RemoveNthNodeFromEndofList19();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        final ListNode newHead = removeNthNodeFromEndofList19.removeNthFromEnd(
                head, 1);
        assertThat(newHead.val, is(1));
        assertNull(newHead.next);

        assertNull(removeNthNodeFromEndofList19.removeNthFromEnd( new
                                                                          ListNode(1), 1));
    }
}