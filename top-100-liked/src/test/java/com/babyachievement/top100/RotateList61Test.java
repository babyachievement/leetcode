package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RotateList61Test {

    @Test
    public void rotateRight() {
        RotateList61 rotateList61 = new RotateList61();
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode listNode = rotateList61.rotateRight(head, 2);

        assertThat(listNode.val, is(4));

    }
}