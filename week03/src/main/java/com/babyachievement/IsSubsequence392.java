/**
 * date: 2019/3/8 16:28
 */

package com.babyachievement;

public class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i == s.length()) {
            return true;
        }

        return false;
    }
}
