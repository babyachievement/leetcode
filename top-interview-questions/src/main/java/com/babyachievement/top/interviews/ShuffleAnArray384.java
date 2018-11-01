/**
 * date: 2018/11/1 17:14
 */

package com.babyachievement.top.interviews;

import java.util.Arrays;
import java.util.Random;

/**
 * https://leetcode.com/problems/shuffle-an-array/description/
 */
public class ShuffleAnArray384 {

    int[]  nums;
    Random random = new Random();

    public ShuffleAnArray384(int[] nums) {
        this.nums = nums;

    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        final int[] result   = Arrays.copyOf(nums, nums.length);
        shuffle(result, 0);
        return result;
    }


    public void shuffle(int[] nums, int start) {
        if (start == nums.length) {
            return;
        }

        final int i = random.nextInt(nums.length - start);
        swap(nums, start, i + start);
        shuffle(nums, start + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
