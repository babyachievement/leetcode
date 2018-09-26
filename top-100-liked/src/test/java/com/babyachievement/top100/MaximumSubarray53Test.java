package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 14:51
 */
public class MaximumSubarray53Test {

    @Test
    public void maxSubArray() {
        final MaximumSubarray53 maximumSubarray53 = new MaximumSubarray53();
        assertThat(maximumSubarray53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1,
                -5, 4}), is(6));
    }
}