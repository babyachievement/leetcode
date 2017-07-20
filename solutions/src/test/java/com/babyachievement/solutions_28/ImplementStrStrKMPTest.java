package com.babyachievement.solutions_28;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * File: ImplementStrStrKMPTest.java
 * -------------------------------------------------
 * date: 2017/7/20 20:59
 *
 * @author babyachievement
 * @version version 1.0
 * @since 1.0
 */
public class ImplementStrStrKMPTest {
    @Test
    public void strStr() throws Exception {
        ImplementStrStrKMP implementStrStr = new ImplementStrStrKMP();
        int i = implementStrStr.strStr("cddcdc", "cdc");
        assertThat(i, is(3));

        i = implementStrStr.strStr("abcdefg", "abcac");
        assertThat(i, is(-1));

        i = implementStrStr.strStr("ababcabcacbab", "abcac");
        assertThat(i, is(5));

        i = implementStrStr.strStr("ababcabcacbab", "");
        assertThat(i, is(0));

        i = implementStrStr.strStr("", "");
        assertThat(i, is(0));
    }

    @Test
    public void testGetNext() throws Exception {
        ImplementStrStrKMP implementStrStr = new ImplementStrStrKMP();
        String needle = "abcac";
        int[] next = new int[needle.length()];
        implementStrStr.getNext(needle, next);
        assertTrue(next[0] == -1);
        assertTrue(next[1] == 0);
        assertTrue(next[2] == 0);
        assertTrue(next[3] == 0);
        assertTrue(next[4] == 1);
    }
}