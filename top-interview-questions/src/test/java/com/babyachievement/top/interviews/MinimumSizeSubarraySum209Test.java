package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumSizeSubarraySum209Test {

    @Test
    public void minSubArrayLen() {
        MinimumSizeSubarraySum209 minimumSizeSubarraySum209 = new MinimumSizeSubarraySum209();
        assertThat(minimumSizeSubarraySum209.minSubArrayLen(7, new int[]{2,3,1,2,4,3}), is(2));
        assertThat(minimumSizeSubarraySum209.minSubArrayLen(11, new int[]{1,2,3,4,5}), is(3));
    }
}