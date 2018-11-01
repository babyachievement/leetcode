package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/1 16:06
 */
public class Four4SumII454Test {

    @Test
    public void fourSumCount() {
        final Four4SumII454 four4SumII454 = new Four4SumII454();
        final int i = four4SumII454.bruteForceFourSumCount(new int[]{1, 2},
                                                           new int[]{-2, -1},
                                                           new int[]{-1, 2},
                                                           new int[]{0, 2});
        assertThat(i, is(2));

        int j = four4SumII454.bruteForceFourSumCount(new int[]{-1, -1},
                                                           new int[]{-1, 1},
                                                           new int[]{-1, 1},
                                                           new int[]{1, -1});
        assertThat(j, is(6));

    }
}