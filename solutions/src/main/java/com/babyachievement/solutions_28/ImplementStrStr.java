/**
 * FileName:ImplementStrStr
 * Created by babyachievement
 * Date:17-7-20
 * Time:上午7:54
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * </p>
 */
package com.babyachievement.solutions_28;

public class ImplementStrStr {
    /**
     * my
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int stackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > stackLength) {
            return -1;
        }

        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < stackLength - needleLength + 1; i++) {
            for (int j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                } else {
                    if (j == needleLength - 1) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}
