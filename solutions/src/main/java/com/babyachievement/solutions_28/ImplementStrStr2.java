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

public class ImplementStrStr2 {
    /**
     * Brute-Force算法实现
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


        int i = 0, j = 0;

        while (i < stackLength && j < needleLength) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        if (j >= needleLength) {
            return i - j;
        }

        return -1;
    }
}
