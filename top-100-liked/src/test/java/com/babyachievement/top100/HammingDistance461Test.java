package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 13:39
 */
public class HammingDistance461Test {

    @Test
    public void hammingDistance() {
        final HammingDistance461 hammingDistance461 = new HammingDistance461();
        assertThat(hammingDistance461.hammingDistance(1, 4), is(2));
    }
}