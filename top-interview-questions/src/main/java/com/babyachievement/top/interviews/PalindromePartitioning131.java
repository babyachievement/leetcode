/**
 * date: 2018/10/24 10:45
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-partitioning/description/
 */
public class PalindromePartitioning131 {
    public List<List<String>> partition(String s) {
        return backtrack(s, 0, s.length()-1);
    }

    public List<List<String>> backtrack(String s, int start, int end) {
        List<List<String>> result = new ArrayList<>();
        if (start > end) {
            return result;
        }


        for (int i = start; i <= end; i++) {
            if (isPalindromic(s, start, i)) {
                if (i == end) {
                    List<String> temp = new ArrayList<>();
                    temp.add(s.substring(start, i + 1));
                    result.add(temp);
                } else {
                    final List<List<String>> backtrack = backtrack(s,
                                                                   i + 1, end);
                    for (List<String> strings : backtrack) {
                        strings.add(0, s.substring(start, i + 1));
                        result.add(strings);
                    }
                }
            }
        }

        return result;
    }

    public boolean isPalindromic(String str, int i, int j) {
        if (str == null) {
            return false;
        }

        if (str.length() == 0) {
            return true;
        }

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            j--;
            i++;
        }

        return true;
    }
}
