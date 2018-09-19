/**
 * date: 2018/9/19 16:20
 */

package com.babyachievement.top100;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        final int   length = nums.length;
        final int[] maxs   = new int[length];
        final int[] mins   = new int[length];

        int max = nums[0];
        maxs[0] = nums[0];
        mins[0] = nums[0];

        for (int i = 1; i < length; i++) {
            if (nums[i] > 0) {
                if (maxs[i - 1] > 0) {
                    maxs[i] = maxs[i - 1] * nums[i];
                    if (mins[i - 1] < 1)
                        mins[i] = mins[i - 1] * nums[i];
                    else
                        mins[i] = nums[i];
                } else {
                    maxs[i] = nums[i];
                    mins[i] = nums[i] * mins[i - 1];
                }


                max = Math.max(max, maxs[i]);
            } else if (nums[i] <= 0) {
                if (mins[i - 1] > 0) {
                    mins[i] = nums[i] * maxs[i - 1];
                    maxs[i] = nums[i];
                } else {
                    if (maxs[i - 1] > 0) {
                        mins[i] = maxs[i - 1] * nums[i];
                        maxs[i] = mins[i - 1] * nums[i];
                    } else {
                        maxs[i] = nums[i] * mins[i - 1];
                        mins[i] = nums[i];
                    }
                }
                max = Math.max(max, maxs[i]);
            }
        }

        return max;
    }

    public int maxProduct2(int[] nums) {
        final int length = nums.length;

        int currentMax = nums[0];
        int currentMin = nums[0];
        int max        = currentMax;


        int temp;
        for (int i = 1; i < length; i++) {
            if (nums[i] < 0) {
                temp = currentMax;
                currentMax = Math.max(currentMin * nums[i], nums[i]);
                currentMin = Math.min(temp * nums[i], nums[i]);
            } else {
                currentMax = Math.max(currentMax * nums[i], nums[i]);
                currentMin = Math.min(currentMin * nums[i], nums[i]);
            }

            max = Math.max(currentMax, max);
        }

        return max;
    }
}
