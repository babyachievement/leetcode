/**
 * date: 2018/9/10 14:54
 */

package org.babyachievement.algorithms.binarytree;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
 */
public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }


        int low = 0, high = nums.length - 1;
        int mid;
        boolean result = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                result = true;
                break;
            }

            if (nums[mid] > nums[low]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < nums[low]) {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            } else {
                low++;
            }
        }


        return result;

    }
}
