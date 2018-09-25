/**
 * date: 2018/9/25 18:17
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class FindTheDuplicateNumber287 {
    /**
     * 太牛了
     *
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]];

        while (slow != fast) {
            fast = nums[nums[fast]];
            slow = nums[slow];
        }

        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
