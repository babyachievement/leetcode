package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/19 16:50
 */
public class Sqrt69Test {

    @Test
    public void mySqrt() {
        final Sqrt69 sqrt69 = new Sqrt69();
        assertThat(sqrt69.mySqrt(4), is(2));
        assertThat(sqrt69.mySqrt(1), is(1));
        assertThat(sqrt69.mySqrt(2), is(1));
        assertThat(sqrt69.mySqrt(8), is(2));
        assertThat(sqrt69.mySqrt(0), is(0));
        assertThat(sqrt69.mySqrt(2147395599), is(46339));
        assertThat(sqrt69.mySqrt(2147395600), is(46340));
        assertThat(sqrt69.mySqrt(2147483647), is(46340));
    }
}