package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/sort-colors/description/
 */
public class SortColors75 {
    public void sortColors(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int current = 0;
        while (current <= j) {
            if (nums[current] == 0) {
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
                i++;

                if (current < i) {
                    current = i;
                }

            } else if (nums[current] == 2) {
                int temp = nums[j];
                nums[j] = nums[current];
                nums[current] = temp;
                j--;
            } else {
                current++;
            }
        }

    }
}
