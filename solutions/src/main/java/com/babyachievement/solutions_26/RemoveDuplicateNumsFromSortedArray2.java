/**
 * FileName:RemoveDuplicateNumsFromSortedArray
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午11:37
 */
package com.babyachievement.solutions_26;

public class RemoveDuplicateNumsFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int distinctCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[distinctCount++] = nums[i];
            }
        }

        return distinctCount;
    }
}
