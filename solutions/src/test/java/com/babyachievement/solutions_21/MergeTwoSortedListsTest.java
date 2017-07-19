package com.babyachievement.solutions_21;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * FileName:MergeTwoSortedListsTest
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午11:13
 */
public class MergeTwoSortedListsTest {
    @Test
    public void mergeTwoLists() throws Exception {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode newList = mergeTwoSortedLists.mergeTwoLists(null, null);
        assertNull(newList);

        ListNode l2 = new ListNode(1);
        System.out.println(l2.next);
        newList = mergeTwoSortedLists.mergeTwoLists(null, l2);
        assertTrue(newList == l2);
        assertNull(newList.next);
    }

}