package com.babyachievement;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextPermutation31Test {

    @Test
    public void nextPermutation() {
        NextPermutation31 permutation31 = new NextPermutation31();
        int[] nums = {1, 2, 3};
        permutation31.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);

        int[] nums2 = {3, 2, 1};
        permutation31.nextPermutation(nums2);
        assertArrayEquals(new int[]{1,2,3}, nums2);

        int[] nums3 = {2,4,3,1};
        permutation31.nextPermutation(nums3);
        assertArrayEquals(new int[]{3,1,2,4}, nums3);

        int[] nums4 = {5, 1, 1};
        permutation31.nextPermutation(nums4);
        assertArrayEquals(new int[]{1,1, 5}, nums4);
    }
}