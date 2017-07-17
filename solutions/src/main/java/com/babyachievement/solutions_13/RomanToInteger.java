package com.babyachievement.solutions_13;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转成数字
 *
 * @user Alvin
 * @create 2017-07-17 20:49
 */

public class RomanToInteger {
    /**
     * 从右向左结合
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        int post = getNumByChar(s.charAt(length - 1));
        sum += post;
        for (int i = length - 2; i > -1; i--) {
            int current = getNumByChar(s.charAt(i));
            if (current >= post) {
                sum += current;
            } else {
                sum -= current;
            }
            post = current;
        }

        return sum;
    }

    public int getNumByChar(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
