package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/31 17:41
 */
public class IntersectionOfTwoArraysII350Test {

    @Test
    public void intersect() {
        final IntersectionOfTwoArraysII350 twoArraysII350 = new IntersectionOfTwoArraysII350();
        assertArrayEquals(new int[]{2, 2}, twoArraysII350.intersect2(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, twoArraysII350.intersect2(new
                                                                            int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }
}