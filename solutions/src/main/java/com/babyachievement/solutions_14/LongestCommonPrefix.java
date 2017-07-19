/**
 * FileName:LongestCommonPrefix
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午8:52
 */
package com.babyachievement.solutions_14;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
