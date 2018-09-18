/**
 * date: 2018/9/18 13:32
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/sort-colors/description/
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int n            = nums.length;
        int currentIndex = 0;
        int next2Index   = n - 1;
        int next0Index   = 0;

        while (currentIndex <= next2Index) {
            if (nums[currentIndex] == 0) {
                swap(nums, currentIndex, next0Index);
                if (currentIndex == next0Index) {
                    currentIndex++;
                }
                next0Index++;
            } else if (nums[currentIndex] == 1) {
                currentIndex++;
            } else if (nums[currentIndex] == 2) {
                swap(nums, currentIndex, next2Index);
                next2Index--;
            }
        }

    }

    private void swap(int[] nums, int currentIndex, int last0Index) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[last0Index];
        nums[last0Index] = temp;
    }
}
