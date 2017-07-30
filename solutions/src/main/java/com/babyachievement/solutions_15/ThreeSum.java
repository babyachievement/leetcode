/**
 * FileName:ThreeSum
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午9:12
 */
package com.babyachievement.solutions_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();


        Arrays.sort(nums);

        for (int i = 0; i < length - 2; i++) {
            if (i >=1 && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = 0 - nums[i];
            int start = i + 1;
            while (start < length - 1) {
                if (nums[start] == nums[start - 1] && start != i + 1) {
                    start++;
                    continue;
                }

                int index = search(nums, start + 1, length - 1, sum - nums[start]);
                if (index != -1) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[index]));
                }
                start++;
            }
        }

        return result;
    }

    public int search(int[] integers, int start, int end, int value) {
        if (start < 0 || start > end) {
            return -1;
        }
        if (integers[start] == value) {
            return start;
        }

        if (integers[end] == value) {
            return end;
        }

        int mid = (start + end) / 2;

        if (integers[mid] == value) {
            return mid;
        }

        if (integers[mid] > value) {
            return search(integers, start, mid - 1, value);
        } else {
            return search(integers, mid + 1, end, value);
        }
    }

}
