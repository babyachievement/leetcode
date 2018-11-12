package com.babyachievement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/description/
 */
public class Three3Sum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < length - 2; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = 0 - nums[i];

            int l = i + 1;
            int r = length - 1;
            while (l < r) {
                if (nums[r] + nums[l] == sum) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (nums[r] + nums[l] > sum) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return result;
    }
}
