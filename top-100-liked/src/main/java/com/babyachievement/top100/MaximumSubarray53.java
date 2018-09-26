/**
 * date: 2018/9/26 14:51
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int currentMax = 0;
        int max        = nums[0];
        currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, currentMax);
            if (currentMax < 0) {
                currentMax = nums[i];
            } else {
                currentMax += nums[i];
            }
        }


        return Math.max(max, currentMax);
    }
}
