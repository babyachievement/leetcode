package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/28 9:46
 */
public class PartitionEqualSubsetSum416Test {

    @Test
    public void canPartition() {
        final PartitionEqualSubsetSum416 equalSubsetSum416 = new PartitionEqualSubsetSum416();
        assertTrue(equalSubsetSum416.canPartition(new int[]{1, 5, 11, 5}));
        assertFalse(equalSubsetSum416.canPartition(new int[]{1, 2, 3, 5}));
    }
}