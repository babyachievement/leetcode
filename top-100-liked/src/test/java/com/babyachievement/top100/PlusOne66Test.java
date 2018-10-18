package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/15 10:06
 */
public class PlusOne66Test {

    @Test
    public void plusOne() {
        final PlusOne66 plusOne66 = new PlusOne66();
        assertArrayEquals(new int[]{1, 2, 4}, plusOne66.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 0}, plusOne66.plusOne(new int[]{9}));
    }
}