package com.babyachievement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum-closest/description/
 */
public class Three3SumClosest16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < length - 2; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int rest = target - nums[i];

            int l = i + 1;
            int r = length - 1;
            while (l < r) {
                int diff = rest - nums[r] - nums[l];
                if (diff == 0) {
                    return target;
                }
                if (Math.abs(diff) <= Math.abs(min)) {
                    min = diff;
                }
                if (diff < 0) {
                    r--;
                } else {
                    l++;
                }
               
            }
        }


        return target - min;
    }
}
