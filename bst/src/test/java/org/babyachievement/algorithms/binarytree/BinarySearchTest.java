package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/5 15:37
 */
public class BinarySearchTest {

    @Test
    public void search() {
        assertEquals(4,
                     new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12},
                                               9));
        assertEquals(0,
                     new BinarySearch().search(new int[]{-1},
                                               -1));

    }

    @Test
    public void whenTargetNotExistsReturnNegativeOne() {
        assertEquals(-1, new BinarySearch().search(new int[]{-1, 0, 3, 5, 9,
                                                           12},
                                                  2));

        assertEquals(-1, new BinarySearch().search(new int[]{2, 5},
                                                  0));
    }
}