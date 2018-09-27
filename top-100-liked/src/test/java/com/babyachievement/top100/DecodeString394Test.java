package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/27 16:03
 */
public class DecodeString394Test {

    @Test
    public void decodeString() {
        final DecodeString394 decodeString394 = new DecodeString394();

        assertThat(decodeString394.decodeString("3[a]2[bc]"), is("aaabcbc"));
        decodeString394.index = 0;
        assertThat(decodeString394.decodeString("3[a2[c]]"), is(
                "accaccacc"));
        decodeString394.index = 0;
        assertThat(decodeString394.decodeString("2[abc]3[cd]ef"), is(
                "abcabccdcdcdef"));
        decodeString394.index = 0;
        assertThat(decodeString394.decodeString("leetcode"), is(
                "leetcode"));

        decodeString394.index = 0;
        assertThat(decodeString394.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"), is(
                "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef"));


    }
}