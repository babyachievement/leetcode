package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/19 16:44
 */
public class MaximumProductSubarrayTest {

    @Test
    public void maxProduct() {
        final MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        assertThat(maximumProductSubarray.maxProduct2(new int[]{2, 3, -2, 4}),
                                                     is(6));
        assertThat(maximumProductSubarray.maxProduct2(new int[]{-2,0,-1}),
                   is(0));

        assertThat(maximumProductSubarray.maxProduct2(new int[]{-2,3,-4}),
                   is(24));
        assertThat(maximumProductSubarray.maxProduct2(new int[]{-1,-2,-9,-6}),
                   is(108));
    }
}