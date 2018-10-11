package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/11 11:17
 */
public class FindFirsAndLastPositionOfElementInSortedArray34Test {

    @Test
    public void searchRange() {
        final FindFirsAndLastPositionOfElementInSortedArray34 position = new FindFirsAndLastPositionOfElementInSortedArray34();
        final int[] result = position
                .searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        assertArrayEquals(result, new int[]{3, 4});
        assertArrayEquals(position.searchRange(new int[]{5, 7, 7, 8, 8, 10},
                                               6),
                          new int[]{-1, -1});

        assertArrayEquals(position.searchRange(new int[]{5, 7, 7, 8, 8, 10},
                                               5),
                          new int[]{0, 0});

        assertArrayEquals(position.searchRange(new int[]{2,2},
                                               1),
                          new int[]{-1, -1});

    }
}