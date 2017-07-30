/**
 * FileName:LongestPalindromicSubstring
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午7:00
 */
package com.babyachievement.solutions_5;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example:
 * <p>
 * Input: "babad"
 * <p>
 * Output: "bab"
 * <p>
 * Note: "aba" is also a valid answer.
 * Example:
 * <p>
 * Input: "cbbd"
 * <p>
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int length = s.length();
        int lastLength = 1;
        int lastStartIndex = 0;

        char[] chars = s.toCharArray();
        for (int i = 1; i < length; i++) {
            String currentStr = s.substring(0, i);
            int occurIndex = currentStr.indexOf(s.charAt(i));
            if (occurIndex == -1) {
                continue;
            } else {
                while (occurIndex <= i && occurIndex != -1 && (i - occurIndex + 1 > lastLength)) {
                    if (isPalindromic(chars, occurIndex, i)) {
                        lastStartIndex = occurIndex;
                        lastLength = currentStr.length() - occurIndex + 1;
                        break;
                    } else {
                        occurIndex = currentStr.indexOf(s.charAt(i), occurIndex + 1);
                    }
                }
            }
        }

        return s.substring(lastStartIndex, lastStartIndex + lastLength);
    }

    /**
     * check a string if it's palindromic string
     *
     * @param str
     * @param i   start
     * @param j   end
     * @return
     */
    public boolean isPalindromic(char[] str, int i, int j) {
        if (str == null) {
            return false;
        }

        if (str.length == 0) {
            return true;
        }

        while (i <= j) {
            if (str[i] != str[j]) {
                return false;
            }

            j--;
            i++;
        }

        return true;
    }
}
