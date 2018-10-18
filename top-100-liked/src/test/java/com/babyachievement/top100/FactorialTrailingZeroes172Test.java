package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/18 11:40
 */
public class FactorialTrailingZeroes172Test {

    @Test
    public void trailingZeroes() {
        final FactorialTrailingZeroes172 trailingZeroes172 = new FactorialTrailingZeroes172();
        assertThat(trailingZeroes172.trailingZeroes(3), is(0));
        assertThat(trailingZeroes172.trailingZeroes(5), is(1));
        assertThat(trailingZeroes172.trailingZeroes(10), is(2));
        assertThat(trailingZeroes172.trailingZeroes(15), is(3));
        System.out.println(trailingZeroes172.trailingZeroes(3125));
    }
}