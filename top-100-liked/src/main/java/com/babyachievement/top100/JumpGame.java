/**
 * date: 2018/9/18 10:09
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/jump-game/description/
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int current = 0;

        while (current <= nums.length - 1 && maxReach >= current) {
            if (maxReach >= nums.length - 1) {
                return true;
            }

            if (current + nums[current] > maxReach) {
                maxReach = current + nums[current];
            }

            current++;
        }

        return false;

    }
}
