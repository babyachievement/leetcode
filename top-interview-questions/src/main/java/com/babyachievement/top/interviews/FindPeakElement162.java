/**
 * date: 2018/10/18 15:01
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/find-peak-element/description/
 */
public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        int low       = 0;
        int high      = nums.length - 1;
        int mid;
        int peakIndex = 0;
        while (low <= high) {
            if (isPeak(nums, low)==low) {
                peakIndex = low;
                break;
            }

            if (isPeak(nums, high) == high) {
                peakIndex = high;
                break;
            }

            mid = (low + high) / 2;
            final int greater = isPeak(nums, mid);
            if (greater == mid) {
                peakIndex = mid;
                break;
            } else if (greater > mid) {
                low = greater;
            } else {
                high = greater;
            }
        }
        return peakIndex;
    }

    int isPeak(int[] nums, int i) {
        if (i == 0) {
            return nums.length == 1 ? 0 : (nums[i] > nums[i + 1] ? i : i + 1);
        }

        if (i == nums.length - 1) {
            return nums.length == 1 ? i : (nums[i] > nums[i - 1] ? i : i - 1);
        }

        if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
            return i;
        } else if (nums[i] < nums[i + 1]) {
            return i + 1;
        } else {
            return i - 1;
        }
    }
}
