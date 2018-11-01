/**
 * date: 2018/11/1 14:24
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/4sum/description/
 */
public class Four4Sum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);

        find(nums, 0, target, 4, new LinkedList<>(), result);

        return result;
    }

    void find(int[] nums, int start, int target, int rest,
              LinkedList<Integer> path, List<List<Integer>> result) {
        if (rest <= 0 || start + rest - 1 >= nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            /**
             * 去重
             */
            if (i >= 1 && i - 1 >= start && nums[i] == nums[i - 1]) {
                continue;
            }
            if (rest > 1) {
                path.add(nums[i]);
                find(nums, i + 1, target - nums[i], rest - 1, path, result);
                path.removeLast();
            } else {
                if (nums[i] == target) {
                    path.add(nums[i]);
                    result.add(new ArrayList<>(path));
                    path.removeLast();
                }
            }
        }
    }

    public List<List<Integer>> fourSum2(int[] num, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if (num.length < 4) return ans;
        Arrays.sort(num);
        for (int i = 0; i < num.length - 3; i++) {
            if (num[i] + num[i + 1] + num[i + 2] + num[i + 3] > target)
                break; //first candidate too large, search finished
            if (num[i] + num[num.length - 1] + num[num.length - 2] + num[num.length - 3] < target)
                continue; //first candidate too small
            if (i > 0 && num[i] == num[i - 1])
                continue; //prevents duplicate result in ans list
            for (int j = i + 1; j < num.length - 2; j++) {
                if (num[i] + num[j] + num[j + 1] + num[j + 2] > target)
                    break; //second candidate too large
                if (num[i] + num[j] + num[num.length - 1] + num[num.length - 2] < target)
                    continue; //second candidate too small
                if (j > i + 1 && num[j] == num[j - 1])
                    continue; //prevents duplicate results in ans list
                int low = j + 1, high = num.length - 1;
                while (low < high) {
                    int sum = num[i] + num[j] + num[low] + num[high];
                    if (sum == target) {
                        ans.add(Arrays.asList(num[i],
                                              num[j],
                                              num[low],
                                              num[high]));
                        while (low < high && num[low] == num[low + 1])
                            low++; //skipping over duplicate on low
                        while (low < high && num[high] == num[high - 1])
                            high--; //skipping over duplicate on high
                        low++;
                        high--;
                    }
                    //move window
                    else if (sum < target) low++;
                    else high--;
                }
            }
        }
        return ans;
    }
}
