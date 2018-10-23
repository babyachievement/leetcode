/**
 * date: 2018/10/23 16:25
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 */
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        String temp = s.toLowerCase();
        while (i <= j) {
            while (i < s.length()&&!Character.isLetterOrDigit(temp.charAt(i))) {
                i++;
            }

            while (j >= 0&&!Character.isLetterOrDigit(temp.charAt(j))) {
                j--;
            }

            if (i < s.length() && j >= 0) {
                if (temp.charAt(i) == temp.charAt(j)) {
                    i++;
                    j--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
