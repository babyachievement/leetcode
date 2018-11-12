package com.babyachievement;

import org.babyachievement.algorithms.structure.ListNode;
import org.babyachievement.algorithms.structure.utils.LinkListUtils;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class ReorderList143Test {

    @Test
    public void reorderList() {
        ListNode head = LinkListUtils.buildList(new int[]{1, 2, 3});
        ReorderList143 reorderList143 = new ReorderList143();
        reorderList143.reorderList(head);
        assertThat(head.next.val, is(3));
        assertThat(head.next.next.val, is(2));
        assertNull(head.next.next.next);
    }
}