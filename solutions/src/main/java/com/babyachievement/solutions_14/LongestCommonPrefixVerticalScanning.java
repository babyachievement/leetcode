/**
 * FileName:LongestCommonPrefix
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午8:52
 */
package com.babyachievement.solutions_14;


public class LongestCommonPrefixVerticalScanning {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int size = strs.length;
        String prefix = strs[0];
        int length = prefix.length();
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < size; j++) {
                String str = strs[j];
                if (j == str.length() || str.charAt(i) != prefix.charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }

        return prefix;
    }
}
