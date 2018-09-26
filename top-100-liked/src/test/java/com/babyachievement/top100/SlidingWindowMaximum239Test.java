package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/26 10:00
 */
public class SlidingWindowMaximum239Test {

    @Test
    public void maxSlidingWindow() {
        final SlidingWindowMaximum239 windowMaximum239 = new SlidingWindowMaximum239();
        final int[] maxSlidingWindow = windowMaximum239.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7},
                                                                         3);

        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, maxSlidingWindow);

        // 1 3 -1
    }
}