/**
 * date: 2018/10/31 16:25
 */

package com.babyachievement.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class FirstUniqueCharacterInString387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        final char[]            chars    = s.toCharArray();
        int                     min      = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            if (indexMap.containsKey(Character.valueOf(chars[i]))) {
                indexMap.put(Character.valueOf(chars[i]), -1);
                while (min < i && indexMap.get(chars[min]).intValue() == -1) {
                    min = min + 1;
                }

                if (min == i) {
                    min = Integer.MAX_VALUE;
                }
            } else {
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
                indexMap.put(Character.valueOf(chars[i]), i);
            }
        }

        return min == Integer.MAX_VALUE? -1 : min;
    }

    public int firstUniqChar2(String s) {
        int min = s.length();
        for (char i = 'a'; i <= 'z'; i++) {
            final int first = s.indexOf(i);
            if (first != -1 && s.lastIndexOf(i) == first) {
                min = Math.min(min, first);
            }
        }

        return min == s.length() ? -1 : min;
    }
}
