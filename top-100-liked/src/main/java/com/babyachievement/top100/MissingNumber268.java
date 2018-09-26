/**
 * date: 2018/9/26 11:24
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        final int n    = nums.length;
        int       rest = n * (n + 1) / 2;
        for (int num : nums) {
            rest -= num;
        }

        return rest;
    }
}
