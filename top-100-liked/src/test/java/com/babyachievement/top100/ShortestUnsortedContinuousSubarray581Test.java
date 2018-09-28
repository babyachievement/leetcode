package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 15:46
 */
public class ShortestUnsortedContinuousSubarray581Test {

    @Test
    public void findUnsortedSubarray() {
        final ShortestUnsortedContinuousSubarray581 subarray581 = new ShortestUnsortedContinuousSubarray581();
        assertThat(subarray581.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9,
                15}), is(5));
        assertThat(subarray581.findUnsortedSubarray(new int[]{1}), is(0));
        assertThat(subarray581.findUnsortedSubarray(new int[]{1, 3, 2}), is(2));
        assertThat(subarray581.findUnsortedSubarray(new int[]{}), is(0));
        assertThat(subarray581.findUnsortedSubarray(new int[]{2,1}), is(2));
        assertThat(subarray581.findUnsortedSubarray(new int[]{1,3,5,4,2}), is
        (4));
        assertThat(subarray581.findUnsortedSubarray(new int[]{2,5,3,1,4}), is
        (5));
        assertThat(subarray581.findUnsortedSubarray(new int[]{1,2,3,4,5,5,4,3,2,1,1,2,3,4,5}), is
        (13));
    }
}