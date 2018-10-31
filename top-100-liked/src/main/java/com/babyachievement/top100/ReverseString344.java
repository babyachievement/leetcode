package com.babyachievement.top100;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseString344 {
    public String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length() / 2; i++) {
            char t = chars[i];
            chars[i] = chars[s.length() - 1 - i];
            chars[s.length() - 1 - i] = t;
        }


        return String.valueOf(chars);
    }
}
