package com.babyachievement;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 */
public class FindMinimumInRotatedSortedArray153 {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (l == r) {
                return nums[l];
            }
            int mid = (l + r) / 2;


            if (mid == 0 && nums[mid] < nums[r])
                return nums[mid];


            if (nums[mid] < nums[l]) {
                r = mid;
            } else {
                l = mid;
            }

        }

        return nums[0];
    }
}
