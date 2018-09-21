package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/21 10:35
 */
public class PalindromeLinkedList234Test {

    @Test
    public void isPalindrome() {
        final PalindromeLinkedList234 palindromeLinkedList234 = new PalindromeLinkedList234();
        final ListNode                list1                   = new ListNode(1);
        list1.next = new ListNode(2);
        assertFalse(palindromeLinkedList234.isPalindrome(list1));

        final ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(2);
        list2.next.next.next = new ListNode(1);
        assertTrue(palindromeLinkedList234.isPalindrome(list2));

        final ListNode list3 = new ListNode(1);
        list3.next = new ListNode(2);
        list3.next.next = new ListNode(1);
        assertTrue(palindromeLinkedList234.isPalindrome(list3));

    }
}