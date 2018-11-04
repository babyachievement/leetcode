package com.babyachievement.top100;

/**
 * https://www.lintcode.com/problem/wiggle-sort/description
 */
public class WiggleSort280 {
    public void wiggleSort(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 <= nums.length && nums[i] > nums[i + 1]) {
                swap(nums, i, i + 1);
            }

            if (i - 1 >= 0 && nums[i] > nums[i - 1]) {
                swap(nums, i, i - 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
