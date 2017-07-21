package com.babyachievement.solutions_2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * File: AddTwoNumbersTest.java
 * -------------------------------------------------
 * date: 2017/7/20 21:53
 *
 * @author babyachievement
 * @version version 1.0
 * @since 1.0
 */
public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() throws Exception {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;


        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode = addTwoNumbers.addTwoNumbers(listNode1, listNode4);
        assertThat(listNode.next.next.val, is(8));
    }

    @Test
    public void testGetListLength() throws Exception {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        int listLenth = addTwoNumbers.getListLenth(listNode1);
        assertThat(listLenth, is(3));

        listLenth = addTwoNumbers.getListLenth(listNode2);
        assertThat(listLenth, is(2));

        listLenth = addTwoNumbers.getListLenth(listNode3);
        assertThat(listLenth, is(1));

        listLenth = addTwoNumbers.getListLenth(null);
        assertThat(listLenth, is(0));
    }
}