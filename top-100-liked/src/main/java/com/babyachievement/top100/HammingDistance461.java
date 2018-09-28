/**
 * date: 2018/9/28 13:38
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        int i = x, j = y;

        int count = 0;

        while (i !=j) {
            count += (i & 1) != (j & 1) ? 1 : 0;
            i = i >>1;
            j = j >>1;
        }

        return count;
    }
}
