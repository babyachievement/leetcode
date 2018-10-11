/**
 * date: 2018/10/11 11:16
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
public class FindFirsAndLastPositionOfElementInSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int[] left  = new int[2];
        int[] right = new int[2];
        right[0] = right[1] = nums.length - 1;
        int[] mid    = new int[2];
        int[] result = new int[2];
        result[0]=-1;
        result[1]=-1;

        while (left[0] <= right[0] || left[1] <= right[1]) {
            mid[0] = (left[0] + right[0]) / 2;
            mid[1] = (left[1] + right[1]) / 2;

            if (nums[mid[0]] == target) {
                result[0] = mid[0];
                right[0] = mid[0] - 1;
            } else if (nums[mid[0]] < target) {
                left[0] = mid[0] + 1;
            } else {
                right[0] = mid[0] - 1;
            }

            if (nums[mid[1]] == target) {
                result[1] = mid[1];
                left[1] = mid[1] + 1;
            } else if (nums[mid[1]] < target) {
                left[1] = mid[1] + 1;
            } else {
                right[1] = mid[1] - 1;
            }
        }


        return result;
    }
}
