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

public class ImplementStrStrKMP {
    /**
     * KMP算法实现
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

        if (needleLength == 0) {
            return 0;
        }


        int[] next = new int[needleLength];
        getNext(needle, next);

        int i = 0, j = 0;

        while (i < stackLength && j < needleLength) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j >= needleLength) {
            return i - needleLength;
        }

        return -1;
    }

    public void getNext(String needle, int[] next) {
        int length = needle.length();

        int i = 0, k = -1;
        next[0] = -1;

        while (i < length - 1) {
            if (k == -1 || needle.charAt(i) == needle.charAt(k)) {
                i++;
                k++;
                next[i] = k;
            } else {
                k = next[k];
            }
        }
    }
}
