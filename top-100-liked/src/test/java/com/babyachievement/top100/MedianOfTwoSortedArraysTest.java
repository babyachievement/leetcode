package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

/**
 * date: 2018/9/17 15:37
 */
public class MedianOfTwoSortedArraysTest {

    @Test
    public void findMedianSortedArrays() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double medianSortedArrays = medianOfTwoSortedArrays
                .findMedianSortedArrays2(
                        new int[]{1, 3},
                        new int[]{2});

        assertThat(medianSortedArrays, closeTo(2.0, 0.0001));
        medianSortedArrays = medianOfTwoSortedArrays.findMedianSortedArrays2(
                new int[]{1, 3},
                new int[]{});

        assertThat(medianSortedArrays, closeTo(2.0, 0.0001));
        medianSortedArrays = medianOfTwoSortedArrays.findMedianSortedArrays2(
                new int[]{1, 2},
                new int[]{3, 4});

        assertThat(medianSortedArrays, closeTo(2.5, 0.0001));

        medianSortedArrays = medianOfTwoSortedArrays.findMedianSortedArrays2(
                new int[]{1, 2, 3, 4},
                new int[]{});

        assertThat(medianSortedArrays, closeTo(2.5, 0.0001));
    }
}