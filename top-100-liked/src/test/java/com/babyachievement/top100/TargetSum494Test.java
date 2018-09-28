package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 13:45
 */
public class TargetSum494Test {

    @Test
    public void findTargetSumWays() {
        final TargetSum494 targetSum494 = new TargetSum494();
        assertThat(targetSum494.findTargetSumWays(new int[]{1, 1, 1, 1, 1},
                                                  3), is(5));
        assertThat(targetSum494.findTargetSumWays(new int[]{1, 0},
                                                  1), is(2));
    }
}