/**
 * date: 2018/9/28 17:14
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/description/
 */
public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            result.addAll(subsets(nums, i, 0));
        }

        return result;
    }

    List<List<Integer>> subsets(int[] nums, int length, int start) {
        if (length <= 0) {
            final ArrayList<List<Integer>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            return lists;
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = start; i < nums.length; i++) {
            final List<List<Integer>> subsets = subsets(nums,
                                                        length - 1,
                                                        i + 1);

            for (List<Integer> subset : subsets) {
                subset.add(0, nums[i]);
                result.add(subset);
            }
        }

        return result;
    }
}
