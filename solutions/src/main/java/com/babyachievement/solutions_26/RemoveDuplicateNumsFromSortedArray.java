/**
 * FileName:RemoveDuplicateNumsFromSortedArray
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午11:37
 */
package com.babyachievement.solutions_26;

public class RemoveDuplicateNumsFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int pre = nums[0];
        int dumpCount = 0;

        int length = nums.length;
        for (int j = 1; j < length; j++) {
            if (nums[j] == pre) {
                dumpCount++;
            } else {
                pre = nums[j];
                nums[j - dumpCount] = nums[j];
            }
        }

        return length - dumpCount;
    }
}
