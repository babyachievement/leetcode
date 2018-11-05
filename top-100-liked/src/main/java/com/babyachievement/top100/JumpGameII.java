/**
 * date: 2018/9/18 10:22
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/jump-game-ii/description/
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int maxReach = nums[0];
        int current  = 1;
        int steps    = 0;


        while (current <= nums.length - 1 && maxReach >= current) {
            if (maxReach >= nums.length - 1) {
                steps++;
                break;
            }

            int temp      = maxReach;
            int tempIndex = current;
            for (int i = current; i <= maxReach && i <= nums.length - 1; i++) {
                if (i + nums[i] > temp) {
                    temp = i + nums[i];
                    tempIndex = i;
                }
            }

            if (temp > maxReach) {
                current = tempIndex;
                maxReach = temp;
                steps++;
            }
            current++;
        }

        return steps;
    }

    public int jump2(int[] nums) {
        int curend = 0, curfarest = 0, steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curfarest = Math.max(curfarest, i + nums[i]);
            if (i == curend) {
                steps++;
                curend = curfarest;
            }
        }
        return steps;
    }
}
