package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2019/3/6 17:02
 */
public class NonOverlappingIntervals435Test {

    @Test
    public void eraseOverlapIntervals() {
        final NonOverlappingIntervals435 nonOverlappingIntervals435 = new NonOverlappingIntervals435();

        Interval[] intervals1 = new Interval[]{new Interval(1, 2),
                new Interval(2, 3), new Interval(3, 4), new Interval(1, 3)};


        assertThat(nonOverlappingIntervals435.eraseOverlapIntervals(intervals1), is(1));
        assertThat(nonOverlappingIntervals435.eraseOverlapIntervals(new Interval[]{}),
                   is(0));
    }
}