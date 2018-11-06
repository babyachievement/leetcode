package com.babyachievement;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 */
public class RemoveDuplicatesFromSortedArrayII80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int c     = 1;
        int start = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (c < 2) {
                    nums[start++] = nums[i];
                    c++;
                }
            } else {
                c = 1;
                nums[start++] = nums[i];
            }
        }


        return start;
    }
}
