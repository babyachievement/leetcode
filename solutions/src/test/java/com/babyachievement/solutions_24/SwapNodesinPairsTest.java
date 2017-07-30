package com.babyachievement.solutions_24;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * FileName:SwapNodesinPairsTest
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午11:14
 */
public class SwapNodesinPairsTest {
    @Test
    public void swapPairs() throws Exception {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        SwapNodesinPairs swapNodesinPairs = new SwapNodesinPairs();
        ListNode listNode = swapNodesinPairs.swapPairs(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void swapPairs2() throws Exception {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        SwapNodesinPairs swapNodesinPairs = new SwapNodesinPairs();
        ListNode listNode = swapNodesinPairs.swapPairs(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}