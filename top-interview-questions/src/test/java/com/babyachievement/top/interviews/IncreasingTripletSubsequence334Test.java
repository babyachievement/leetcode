package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/11/2 13:17
 */
public class IncreasingTripletSubsequence334Test {

    @Test
    public void increasingTriplet() {
        final IncreasingTripletSubsequence334 subsequence334 = new IncreasingTripletSubsequence334();
        assertTrue(subsequence334.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertTrue(subsequence334.increasingTriplet(new int[]{2, 3, 1, 4, 5}));
        assertTrue(subsequence334.increasingTriplet(new int[]{2, 3, 1, 4}));
        assertFalse(subsequence334.increasingTriplet(new int[]{2, 4, 1, 3}));
        assertFalse(subsequence334.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }
}