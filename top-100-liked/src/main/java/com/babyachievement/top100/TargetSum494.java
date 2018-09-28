/**
 * date: 2018/9/28 13:43
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/target-sum/description/
 */
public class TargetSum494 {

    public int findTargetSumWays(int[] nums, int S) {
        return dfs(nums, S, 0);
    }

    public int dfs(int[] nums, int S, int index) {

        if (index == nums.length - 1) {
            if (nums[index] == 0) {
                return S == 0 ? 2 : 0;
            } else {
                return nums[index] + S == 0 || nums[index] - S == 0 ? 1 : 0;
            }
        }

        return dfs(nums, S + nums[index], index + 1)
                + dfs(nums, S - nums[index], index + 1);
    }


    /**
     * The original problem statement is equivalent to:
     * Find a subset of nums that need to be positive, and the rest of them negative, such that the sum is equal to target
     *
     * Let P be the positive subset and N be the negative subset
     * For example:
     * Given nums = [1, 2, 3, 4, 5] and target = 3 then one possible solution is +1-2+3-4+5 = 3
     * Here positive subset is P = [1, 3, 5] and negative subset is N = [2, 4]
     *
     * Then let's see how this can be converted to a subset sum problem:
     *
     *                   sum(P) - sum(N) = target
     * sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
     *                        2 * sum(P) = target + sum(nums)
     * So the original problem has been converted to a subset sum problem as follows:
     * Find a subset P of nums such that sum(P) = (target + sum(nums)) / 2
     *
     * Note that the above formula has proved that target + sum(nums) must be even
     * We can use that fact to quickly identify inputs that do not have a solution (Thanks to @BrunoDeNadaiSarnaglia for the suggestion)
     * For detailed explanation on how to solve subset sum problem, you may refer to Partition Equal Subset Sum
     *
     * @param nums
     * @param S
     * @return
     */
    public int findTargetSumWays2(int[] nums, int S) {
        int n   = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum < S || (S + sum) % 2 != 0) {
            return 0;
        }

        // 这里为什么要计算(S+sum)/2?
        return helper(nums, (S + sum) / 2);
    }

    public int helper(int[] nums, int sumP) {
        int[] dp = new int[sumP + 1];
        dp[0] = 1;
        for (int n : nums) {
            for (int i = sumP; i >= n; i--) {
                dp[i] += dp[i - n];
            }
        }
        return dp[sumP];
    }

}
