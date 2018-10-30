package com.babyachievement.top.interviews;

import org.babyachievement.algorithms.structure.RandomListNode;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/30 13:26
 */
public class CopyListWithRandomPointer138Test {

    @Test
    public void copyRandomList() {
        final CopyListWithRandomPointer138 randomPointer138 = new CopyListWithRandomPointer138();
        final RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.random = new RandomListNode(3);

        head.next.next = head.random;
        head.next.random = head;

        head.next.next.next = null;
        head.next.next.random = head.next;


        final RandomListNode newHead = randomPointer138.copyRandomList2(
                head);
        assertThat(newHead.label, is(1));
        assertThat(newHead.next.label, is(2));
        assertThat(newHead.random.label, is(3));
        assertThat(newHead.next.random.label, is(1));
        assertThat(newHead.next.next.random.label, is(2));
    }
}