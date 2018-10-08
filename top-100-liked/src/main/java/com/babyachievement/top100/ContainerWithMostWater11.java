/**
 * date: 2018/9/26 9:54
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int water = 0;
        int i     = 0, j = height.length - 1;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            water = Math.max(water, (j - i) * h);
            while (height[i] <= h && i < j) i++;
            while (height[j] <= h && i < j) j--;
        }
        return water;
    }

    public int maxAreaForce(int[] height) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                if (max < Math.min(height[i], height[j]) * (i - j)) {
                    max = Math.min(height[i], height[j]) * (i - j);
                }
            }
        }

        return max;
    }
}
