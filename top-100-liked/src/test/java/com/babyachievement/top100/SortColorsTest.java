package com.babyachievement.top100;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * date: 2018/9/18 14:08
 */
public class SortColorsTest {

    @Test
    public void sortColors() {
        SortColors sortColors = new SortColors();
        int[]      nums       = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums);
        assertTrue(Arrays.equals(nums, new int[]{0, 0,1,1,2,2}));
    }
}