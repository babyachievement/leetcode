package com.babyachievement.top.interviews;


/**
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
public class MinimumSizeSubarraySum209 {
    public int minSubArrayLen(int s, int[] nums) {
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            s = s - nums[i];
            if (s <= 0) {
                minLen = Math.min(minLen, (i - j + 1));
            }


            if (s < 0) {
                while (j <= i && s < 0) {
                    s = s + nums[j];
                    j++;
                }

                if (s == 0)
                    minLen = Math.min(minLen, (i - j + 1));
                if (s > 0) {
                    minLen = Math.min(minLen, (i - j + 1 + 1));
                }
            }
        }

        return Integer.MAX_VALUE == minLen ? 0 : minLen;
    }
}
