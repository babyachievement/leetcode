/**
 * date: 2018/9/26 15:27
 */

package com.babyachievement.top100;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/description/
 */
public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] lens = new int[nums.length];
        Arrays.fill(lens, 1);

        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    lens[i] = Math.max(lens[j] + 1, lens[i]);
                    max = Math.max(max, lens[i]);
                }
            }
        }

        return max;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int[] subSequ = new int[len];
        Arrays.fill(subSequ, Integer.MAX_VALUE);
        subSequ[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int index = getIndex(subSequ,  nums[i]);
            subSequ[index] = nums[i];
        }
        for (int i = len - 1; i >=0; i--) {
            if(subSequ[i] != Integer.MAX_VALUE) {
                return i + 1;
            }
        }
        return 0;
    }

    private int getIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return nums[left] >= target ? left : right;
    }
}
