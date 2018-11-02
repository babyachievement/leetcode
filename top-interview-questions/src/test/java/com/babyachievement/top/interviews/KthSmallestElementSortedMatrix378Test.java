package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/1 17:55
 */
public class KthSmallestElementSortedMatrix378Test {

    @Test
    public void kthSmallest() {
        final KthSmallestElementSortedMatrix378 kthSmallestElementSortedMatrix378 = new KthSmallestElementSortedMatrix378();
        assertThat(kthSmallestElementSortedMatrix378.kthSmallest(new int[][]{
                {1, 2}, {1, 3}}, 3), is(2));
    }
}