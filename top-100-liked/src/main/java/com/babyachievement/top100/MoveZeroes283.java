/**
 * date: 2018/9/25 18:18
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/move-zeroes/description/
 */
public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int countOfNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[countOfNonZero++] = nums[i];
            }
        }

        for (int i = countOfNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
