/**
 * date: 2018/11/5 18:22
 */

package com.babyachievement;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
public class ZigZagConversion6 {
    public String convert(String s, int numRows) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        List<List<Character>> levels = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            levels.add(new ArrayList<>());
        }

        final int twice = 2 * (numRows - 1);
        for (int i = 0; i < s.length(); i++) {
            int m = i % twice;
            if (m < numRows) {
                levels.get(m).add(s.charAt(i));
            } else {
                levels.get(twice - m).add(s.charAt(i));
            }
        }

        final char[] chars = new char[s.length()];
        int          c     = 0;
        for (int i = 0; i < numRows; i++) {
            final List<Character> level = levels.get(i);
            for (Character character : level) {
                chars[c++] = character.charValue();
            }
        }
        return String.valueOf(chars);
    }
}
