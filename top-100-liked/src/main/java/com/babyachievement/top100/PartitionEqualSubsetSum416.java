/**
 * date: 2018/9/28 9:46
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum/description/
 */
public class PartitionEqualSubsetSum416 {
    public boolean canPartition(int[] nums) {

        int s = 0;
        for (int num : nums) {
            s += num;
        }

        if (s % 2 != 0) {
            return false;
        }

        int[] dp = new int[s / 2 + 1];

        return canPartition(nums, 0, s / 2, dp);
    }

    boolean canPartition(int[] nums, int start, int rest, int[] dp) {
        if (rest == 0) {
            return true;
        }

        if (start >= nums.length) {
            return false;
        }


        if (rest < 0) {
            return false;
        }

        if (dp[rest] == 1) {
            return true;
        }

        if (dp[rest] == -1) {
            return false;
        }

        for (int i = start; i < nums.length; i++) {
            if (canPartition(nums, i + 1, rest - nums[i], dp) || canPartition(nums, i + 1, rest, dp)) {
                dp[rest] = 1;
                return true;
            }
        }

        dp[rest] = -1;
        return false;
    }
}
