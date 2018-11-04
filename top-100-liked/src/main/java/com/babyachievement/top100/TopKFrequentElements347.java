/**
 * date: 2018/9/27 15:57
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        final ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || k == 0) {
            return result;
        }

        int max = 0;
        int min = 0;


        return result;
    }

    List<Integer> topKFrequentBruteForce(int[] nums, int k) {
        final ArrayList<Integer> result = new ArrayList<>();

        Map<Integer, Integer> vCountMap = new HashMap<>();
        List<Set<Integer>>    countVSet = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (vCountMap.containsKey(Integer.valueOf(nums[i]))) {
                final Integer count = vCountMap.get(nums[i]);
                vCountMap.put(Integer.valueOf(nums[i]), count.intValue() + 1);

                countVSet.get(count - 1).remove(Integer.valueOf(nums[i]));

                if (countVSet.size() == count) {
                    Set<Integer> upperSet = new HashSet<>();
                    upperSet.add(Integer.valueOf(nums[i]));
                    countVSet.add(upperSet);
                } else {
                    countVSet.get(count).add(Integer.valueOf(nums[i]));
                }

            } else {
                vCountMap.put(Integer.valueOf(nums[i]), 1);
                if (countVSet.isEmpty()) {
                    Set<Integer> upperSet = new HashSet<>();
                    upperSet.add(Integer.valueOf(nums[i]));
                    countVSet.add(upperSet);
                } else {
                    countVSet.get(0).add(Integer.valueOf(nums[i]));
                }
            }
        }

        for (int i = countVSet.size() - 1; i >= 0 && result.size() < k; i--) {
            final Set<Integer> set = countVSet.get(i);
            for (Integer integer : set) {
                if (result.size() == k) {
                    break;
                }

                result.add(integer);
            }
        }

        return result;
    }
}
