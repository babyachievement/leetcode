/**
 * FileName:RemoveElement
 * Created by babyachievement
 * Date:17-7-20
 * Time:上午7:44
 */
package com.babyachievement.solutions_27;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }

        int leftNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[leftNum++] = nums[i];
            }
        }

        return leftNum;
    }
}
