package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/22 10:14
 */
public class Atoi8Test {

    @Test
    public void myAtoi() {
        final Atoi8 atoi8 = new Atoi8();
        assertThat(atoi8.myAtoi("42"), is(42));
        assertThat(atoi8.myAtoi("  -42"), is(-42));
        assertThat(atoi8.myAtoi("4193 with words"), is(4193));
        assertThat(atoi8.myAtoi("words and 987"), is(0));
        assertThat(atoi8.myAtoi("-91283472332"), is(-2147483648));
        assertThat(atoi8.myAtoi("91283472332"), is(Integer.MAX_VALUE));
        assertThat(atoi8.myAtoi("2147483647"), is(Integer.MAX_VALUE));
        assertThat(atoi8.myAtoi("+1"), is(1));
        assertThat(atoi8.myAtoi("++1"), is(0));
        assertThat(atoi8.myAtoi("--1"), is(0));
        assertThat(atoi8.myAtoi("+-2"), is(0));
        assertThat(atoi8.myAtoi("-+1"), is(0));
        assertThat(atoi8.myAtoi("   +0 123"), is(0));
        assertThat(atoi8.myAtoi("-2147483647"), is(-2147483647));
        assertThat(atoi8.myAtoi("-2147483648"), is(-2147483648));
        assertThat(atoi8.myAtoi("-   234"), is(0));
        assertThat(atoi8.myAtoi("0-1"), is(0));
    }
}