package com.babyachievement;

/**
 * https://leetcode.com/problems/next-permutation/description/
 */
public class NextPermutation31 {
    public void nextPermutation(int[] nums) {
        // 2 3 1 4, 2 4 3 1  -> 3 1 2 4
        // TODO

        int i = nums.length - 1;
        while (i > 0) {
            if (nums[i] > nums[i - 1]) {
                int index = findFirstBiggerIndex(nums, i, nums[i - 1]);
                swap(nums, i - 1, index);
                break;
            }
            i--;
        }

        reverse(nums, i, nums.length - 1);
    }

    private int findFirstBiggerIndex(int[] nums, int start, int v) {
        int i = start;
        while (i < nums.length && nums[i] > v) {
            i++;
        }
        return i - 1;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
