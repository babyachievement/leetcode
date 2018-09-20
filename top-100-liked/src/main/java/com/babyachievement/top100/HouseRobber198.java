/**
 * date: 2018/9/20 15:51
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/house-robber/description/
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        int preNotSelectedMax = 0;
        int preSelectedMax    = 0;

        int temp;

        for (int num : nums) {
            temp = preSelectedMax;
            preSelectedMax = preNotSelectedMax + num;
            preNotSelectedMax = Math.max(temp, preNotSelectedMax);
        }

        return Math.max(preNotSelectedMax, preSelectedMax);
    }
}
