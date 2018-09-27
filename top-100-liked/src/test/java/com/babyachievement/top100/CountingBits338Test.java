package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/27 15:37
 */
public class CountingBits338Test {

    @Test
    public void countBits() {
        final CountingBits338 countingBits338 = new CountingBits338();
        final int[]           bits            = countingBits338.countBits(2);
        assertArrayEquals(new int[]{0, 1, 1}, bits);
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2},
                          countingBits338.countBits(5));
    }
}