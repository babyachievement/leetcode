package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/26 15:30
 */
public class LongestIncreasingSubsequence300Test {

    @Test
    public void lengthOfLIS() {
        final LongestIncreasingSubsequence300 increasingSubsequence300 = new LongestIncreasingSubsequence300();
        assertThat(increasingSubsequence300.lengthOfLIS2(new int[]{10, 9, 2, 5, 3,
                7, 101, 18}), is(4));
    }
}