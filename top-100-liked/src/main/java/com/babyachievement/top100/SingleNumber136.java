/**
 * date: 2018/9/26 10:39
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int t = nums[0];

        for (int i = 1; i < nums.length; i++) {
            t = t ^ nums[i];
        }
        return t;
    }
}
