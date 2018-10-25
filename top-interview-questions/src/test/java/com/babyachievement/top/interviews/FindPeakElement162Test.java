package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/18 15:03
 */
public class FindPeakElement162Test {

    @Test
    public void findPeakElement() {
        final FindPeakElement162 findPeakElement162 = new FindPeakElement162();
        assertThat(findPeakElement162.findPeakElement(new int[]{1, 2, 1}),
                   is(1));
        assertThat(findPeakElement162.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}),
                   is(5));
        assertThat(findPeakElement162.findPeakElement(new int[]{1, 2, 3, 1}),
                   is(2));
        assertThat(findPeakElement162.findPeakElement(new int[]{1, 3, 2, 3, 1}),
                   is(3));
    }
}