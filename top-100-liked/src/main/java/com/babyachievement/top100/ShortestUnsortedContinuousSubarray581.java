/**
 * date: 2018/9/28 15:43
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 */
public class ShortestUnsortedContinuousSubarray581 {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null||nums.length==0) {
            return 0;
        }
        int         max     = Integer.MIN_VALUE;
        final int[] invalid = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[invalid[0]]) {
                invalid[0] = i;
            }
            if (nums[i] < max) {
                if (invalid[0] == 0) {
                    invalid[0] = i;
                } else {
                    invalid[1] = i;
                }
            } else {
                max = Math.max(nums[i], max);
            }
        }

        if (invalid[1] == 0) {
            invalid[1] = invalid[0];
        }
        max = Math.min(nums[invalid[0]], nums[invalid[1]]);
        int i = invalid[0] - 1;

        while (i >= 0) {
            if (nums[i] > max) {
                invalid[0] = i;
            }
            i--;
        }

        final int[] invalidIndex = invalid;


        if(invalidIndex[0]!=invalidIndex[1]) {
            return invalidIndex[1] - invalidIndex[0] +1;
        }
        return 0;
    }

}
