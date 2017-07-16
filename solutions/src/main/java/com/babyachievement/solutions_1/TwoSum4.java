package com.babyachievement.solutions_1;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum/#/description
 * <p>
 * 使用JDK自带的数组排序（双轴快排序）
 *
 * @user Alvin
 * @create 2017-07-16 17:04
 */

public class TwoSum4 {
    public static void main(String[] args) {
        int[] nums = {150, 24, 79, 50, 88, 345, 3};

        int[] ints = new TwoSum4().twoSum(nums, 200);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] origin = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;
        while ((nums[l] + nums[r]) != target) {
            if ((nums[l] + nums[r]) > target) {
                r--;
            } else {
                l++;
            }
        }


        return getIndexs(origin, nums[l], nums[r]);
    }

    private int[] getIndexs(int[] origin, int small, int big) {
        int length = origin.length;
        int[] result = new int[2];
        boolean finded = false;
        for (int i = 0; i < length; i++) {
            if (small == origin[i] || origin[i] == big) {
                if (!finded) {
                    result[0] = i;
                    finded = true;
                }
                else {
                    result[1] = i;
                }
            }
        }
        return result;
    }


}
