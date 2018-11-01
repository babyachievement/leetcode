package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/27 15:59
 */
public class TopKFrequentElements347Test {

    @Test
    public void topKFrequent() {
        final TopKFrequentElements347 topKFrequentElements347 = new TopKFrequentElements347();
        final List<Integer> integers = topKFrequentElements347
                .topKFrequentBruteForce(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertThat(integers.size(), is(2));
        assertTrue(integers.contains(1));
        assertTrue(integers.contains(2));
    }
}