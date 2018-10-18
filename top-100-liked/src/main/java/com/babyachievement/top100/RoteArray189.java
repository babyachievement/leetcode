/**
 * date: 2018/10/18 11:17
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/rotate-array/description/
 */
public class RoteArray189 {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int right = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = right;
        }
    }

    /**
     * Approach #3 Using Cyclic Replacements [Accepted]
     * https://leetcode.com/articles/rotate-array/
     *
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev    = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
