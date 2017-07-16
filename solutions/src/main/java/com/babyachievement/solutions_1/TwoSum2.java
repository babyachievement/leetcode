package com.babyachievement.solutions_1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/#/description
 *
 * @user Alvin
 * @create 2017-07-16 17:04
 */

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {150,24,79,50,88,345,3};

        int[] ints = new TwoSum2().twoSum(nums, 200);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int length = nums.length;
        for(int i = 0; i< length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}
