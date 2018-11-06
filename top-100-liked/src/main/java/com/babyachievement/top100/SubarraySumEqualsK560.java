/**
 * date: 2018/9/28 17:24
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/description/
 */
public class SubarraySumEqualsK560 {
    public int subarraySum(int[] nums, int k) {
        //  improve
        int[] count = new int[1];
        for (int i = 0; i < nums.length; i++) {
            subarraySum(nums, k, i, count);
        }
        return count[0];
    }

    public void subarraySum(int[] nums, int k, int index, int[] count) {
        if (index >= nums.length) {
            return;
        }
        if (nums[index] == k) {
            count[0]++;
        }

        subarraySum(nums, k - nums[index], index + 1, count);
    }
}
