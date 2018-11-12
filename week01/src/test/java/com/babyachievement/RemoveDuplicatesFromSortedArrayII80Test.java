package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/6 17:09
 */
public class RemoveDuplicatesFromSortedArrayII80Test {

    @Test
    public void removeDuplicates() {

        final RemoveDuplicatesFromSortedArrayII80 removeDuplicates = new RemoveDuplicatesFromSortedArrayII80();
        assertThat(removeDuplicates.removeDuplicates(new int[]{1}), is(1));
        assertThat(removeDuplicates.removeDuplicates(new int[]{1, 1}), is(2));
        assertThat(removeDuplicates.removeDuplicates(new int[]{1, 1, 1}),
                   is(2));
        assertThat(removeDuplicates.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}),
                   is(5));
        assertThat(removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}),
                   is(7));

    }
}