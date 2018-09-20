package com.babyachievement.top100;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * date: 2018/9/20 14:12
 */
public class TheSkylineProblem218Test {

    @Test
    public void getSkyline() {
        final TheSkylineProblem218 skyline = new TheSkylineProblem218();

        final List<int[]> list = skyline.getSkyline2(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20
                , 10}, {19, 24, 8}});


        final List<int[]> expected = Arrays.asList(new int[]{2, 10},
                                               new int[]{3, 15},
                                               new int[]{7, 12},
                                               new int[]{12, 0},
                                               new int[]{15, 10},
                                               new int[]{20, 8},
                                               new int[]{24, 0});
        assertThat(list.size(), is(expected.size()));

        for (int i = 0; i < list.size(); i++) {
            assertTrue(Arrays.equals(list.get(i), expected.get(i)));
        }

    }

}