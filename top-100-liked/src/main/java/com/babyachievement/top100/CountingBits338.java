/**
 * date: 2018/9/27 15:34
 */

package com.babyachievement.top100;

public class CountingBits338 {
    public int[] countBits(int num) {
        final int[] result = new int[num + 1];

        if (num >= 1) {
            result[1] = 1;
        }

        for (int i = 2; i <= num; i++) {
            result[i] = result[i % 2] + result[i >> 1];
        }

        return result;
    }
}
