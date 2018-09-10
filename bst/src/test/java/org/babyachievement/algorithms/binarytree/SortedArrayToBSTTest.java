package org.babyachievement.algorithms.binarytree;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/10 14:28
 */
public class SortedArrayToBSTTest {

    SortedArrayToBST sortedArrayToBST;
    @Before
    public void setUp() throws Exception {
        sortedArrayToBST = new SortedArrayToBST();
    }

    @Test
    public void sortedArrayToBST() {
        assertThat(sortedArrayToBST.sortedArrayToBST(new int[]{1, 2}).val, is(1));
        assertThat(sortedArrayToBST.sortedArrayToBST(new int[]{1}).val, is(1));
        assertThat(sortedArrayToBST.sortedArrayToBST(new int[]{1,2,3}).val, is
                (2));
    }
}