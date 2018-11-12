/**
 * date: 2018/11/8 10:00
 */

package com.babyachievement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetsII90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);

        subsets.add(Collections.emptyList());
        for (int i = 1; i <= nums.length; i++) {
            findSubsets(nums, 0, i, subsets, new ArrayList<Integer>());
        }

        return subsets;
    }

    private void findSubsets(int[] nums, int start, int len,
                             List<List<Integer>> subsets, ArrayList<Integer>
                                     subset) {
        if (len == 0) {
            subsets.add(new ArrayList<>(subset));
            return;
        }


        int i = start;

        while (i < nums.length) {
            int j = i;
            while (j + 1 < nums.length && nums[j + 1] == nums[j]) j++;

            int count = j - i + 1;
            for (int k = 1; k <= count && k <= len; k++) {
                for (int l = 0; l < k; l++) {
                    subset.add(nums[i]);
                }
                findSubsets(nums, j + 1, len - k, subsets, subset);
                for (int l = 0; l < k; l++) {
                    subset.remove(subset.size() - 1);
                }
            }
            i = j + 1;
        }
    }


    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> subsets = new ArrayList<>();

        getSubset(subsets, new ArrayList<>(), nums, 0);
        return subsets;
    }

    private void getSubset(List<List<Integer>> subsets, List<Integer> curSubset, int[] nums, int index) {
        subsets.add(new ArrayList<>(curSubset));

        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }

            curSubset.add(nums[i]);
            getSubset(subsets, curSubset, nums, i + 1);
            curSubset.remove(curSubset.size() - 1);
        }
    }
}
