/**
 * date: 2018/10/18 11:36
 */

package com.babyachievement.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/description/
 */
public class FactorialTrailingZeroes172 {
    Map<Integer, Integer> countMap = new HashMap<>();

    public int trailingZeroes(int n) {

        int count = 0;
        int current = n;
        while (current>= 5) {
            count += current/5;
            current = current/5;
        }
        return count;
    }


}
