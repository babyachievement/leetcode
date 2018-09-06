/**
 * date: 2018/9/5 15:36
 */

package org.babyachievement.algorithms.binarytree;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums.
 * If target exists, then return its index, otherwise return -1.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int right = length - 1;
        int left = 0;
        int mid;


        while (left < right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        if (left < length && nums[left] == target) {
            return left;
        }
        if (right > -1 && nums[right] == target) {
            return right;
        }

        return -1;
    }
}
