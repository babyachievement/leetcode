/**
 * date: 2018/10/15 10:04
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }

        int rest = 1;
        int pre;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
