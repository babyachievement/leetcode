/**
 * FileName:ImplementStrStr
 * Created by HaoQiang
 * Date:17-7-20
 * Time:上午7:54
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * </p>
 */
package com.babyachievement.solutions_28;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int stackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > stackLength) {
            return -1;
        }

        // TODO: KMP

        return -1;
    }
}
