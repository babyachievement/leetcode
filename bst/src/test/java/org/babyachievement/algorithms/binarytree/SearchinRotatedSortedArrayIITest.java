package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/9/11 9:53
 */
public class SearchinRotatedSortedArrayIITest {

    @Test
    public void search() {
        assertTrue(new SearchinRotatedSortedArrayII().search(new int[]{3,5,1
        }, 3));
    }
}