package com.babyachievement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.lintcode.com/problem/3sum-smaller/description
 */
public class Three3SumSmaller {
    public int threeSumSmaller(int[] nums, int target) {

        Arrays.sort(nums);
        int length = nums.length;

        int count = 0;

        for (int i = 0; i < length - 2; i++) {
            int rest = target - nums[i];

            int l = i + 1;
            int r = length - 1;
            while (l < r) {
                if (nums[r] + nums[l] >= rest) {
                    r--;
                } else {
                    count += r - l;
                    l++;
                }
            }
        }

        return count;
    }
}
