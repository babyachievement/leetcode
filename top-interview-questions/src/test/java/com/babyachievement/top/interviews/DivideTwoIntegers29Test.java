package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/22 13:59
 */
public class DivideTwoIntegers29Test {

    @Test
    public void divide() {
        final DivideTwoIntegers29 divideTwoIntegers29 = new DivideTwoIntegers29();
        assertThat(divideTwoIntegers29.divide(7, -3), is(-2));
        assertThat(divideTwoIntegers29.divide(10, 3), is(3));
        assertThat(divideTwoIntegers29.divide(-10, 3), is(-3));
        assertThat(divideTwoIntegers29.divide(0, 3), is(0));
        assertThat(divideTwoIntegers29.divide(10, 1), is(10));
        assertThat(divideTwoIntegers29.divide(10, 2), is(5));
        assertThat(divideTwoIntegers29.divide(1, 3), is(0));
        assertThat(divideTwoIntegers29.divide(1, -3), is(0));
        assertThat(divideTwoIntegers29.divide(10, -3), is(-3));
        assertThat(divideTwoIntegers29.divide(-2147483648, -1), is(2147483647));
    }
}