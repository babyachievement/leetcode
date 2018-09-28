package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/27 18:01
 */
public class QueueReconstructionByHeight406Test {

    @Test
    public void reconstructQueue() {
        final QueueReconstructionByHeight406 reconstruction = new QueueReconstructionByHeight406();
        final int[][] reconstructQueue = reconstruction.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5,
                0}, {6, 1}, {5, 2}});
        final int[][] expected = {
                {5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}
        };
        for (int i = 0; i < 5; i++) {
            assertArrayEquals(expected[i], reconstructQueue[i]);
        }
    }
}