/**
 * date: 2018/9/18 16:11
 */

package com.babyachievement.top100;

import java.util.List;

/**
 * https://leetcode.com/problems/word-break/description/
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.isEmpty() || wordDict.contains(s)) {
            return true;
        }

        final int n   = s.length();
        boolean[] mem = new boolean[n + 1];
        mem[0] = true;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (mem[j] && check(s, j, i, wordDict)) {
                    mem[i] = true;
                    break;
                }
            }
        }

        return mem[n];
    }

    boolean check(String s, int start, int end, List<String> wordDict) {
        if (start == end) {
            return true;
        }

        return wordDict.contains(s.substring(start, end));
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        int[] visited = new int[s.length() + 1];
        return wordBreak(s, wordDict, visited, 0);
    }

    boolean wordBreak(String s, List<String> wordDict, int[] visited, int offset) {
        visited[offset] = 1;
        if (offset == s.length()) {
            return true;
        }

        for (String word : wordDict) {
            if (s.startsWith(word, offset)) {
                if (visited[offset + word.length()] == 0) {
                    if (wordBreak(s,
                                  wordDict,
                                  visited,
                                  offset + word.length())) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
