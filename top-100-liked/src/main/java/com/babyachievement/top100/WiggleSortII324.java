/**
 * date: 2018/11/2 14:27
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/wiggle-sort-ii/description/
 */
public class WiggleSortII324 {
    public void wiggleSort(int[] nums) {
        boolean equal = false;
        int equalStart = 0;
        int i = 0;
        while (i < nums.length) {
            if (i + 1 <= nums.length) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    equal = false;
                } else if (nums[i] == nums[i + 1]) {
                    equal = true;
                    equalStart = i;
                }
            }


            // TODO
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
