/**
 * FileName:LongestCommonPrefix
 * Created by babyachievement
 * Date:17-7-19
 * Time:下午8:52
 */
package com.babyachievement.solutions_14;


public class LongestCommonPrefixDivideAndConquer {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    public String longestCommonPrefix(String[] strs, int l, int r) {
        if (r == l) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String left = longestCommonPrefix(strs, l, mid);
            String right = longestCommonPrefix(strs, mid + 1, r);
            return commPrefix(left, right);
        }
    }

    public String commPrefix(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return "";
        }

        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }

        return str1.substring(0, min);
    }
}
