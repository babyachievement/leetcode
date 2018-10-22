/**
 * date: 2018/10/19 17:21
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class Atoi8 {
    public int myAtoi(String str) {
        int result = 0;

        boolean negative = false;
        boolean signed   = false;
        boolean start    = false;
        int     i        = 0;
        while (str.charAt(i) == ' ') {
            i++;
        }
        for (; i < str.length(); i++) {
            if (str.charAt(i) == '+' && !signed && !start) {
                signed = true;
                continue;
            }

            if (str.charAt(i) == '-' && !signed && !start) {
                negative = true;
                signed = true;
                continue;
            }

            start = true;

            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                break;
            }

            if (checkNum(result, negative, str.charAt(i))) {
                result = result * 10 + (str.charAt(i) - '0');
            } else {
                result = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                break;
            }
        }

        if (result <= Integer.MAX_VALUE && result > Integer.MIN_VALUE) {
            return negative ? -result : result;
        }

        return result;
    }

    boolean checkNum(int result, boolean negative, char c) {
        boolean valid = true;
        if (!negative) {
            if (result > (Integer.MAX_VALUE - (c - '0')) / 10) {
                valid = false;
            }
        } else {
            if (result > (Integer.MAX_VALUE - (c - '0')) / 10) {
                valid = false;
            }
        }

        return valid;
    }
}
