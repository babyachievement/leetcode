/**
 * date: 2018/9/26 9:54
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        final int max = Integer.MIN_VALUE;

        // TODO
        return 0;
    }

    public int maxAreaForce(int[] height) {
        int max = Integer.MIN_VALUE;
        for(int i=1; i<height.length; i++) {
            for(int j=0; j<i; j++) {
                if(max < Math.min(height[i],height[j]) * (i-j)) {
                    max = Math.min(height[i],height[j]) * (i-j);
                }
            }
        }

        return max;
    }
}
