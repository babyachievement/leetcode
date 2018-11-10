package com.babyachievement;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/description/
 */
public class ReverseWordsInAString151 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        boolean hasWord = false;
        int wordEnd = s.length() - 1;
        while (j >= i) {
            if (Character.isWhitespace(chars[j])) {
                if (hasWord) {
                    i = rotateWord(chars, i, j, wordEnd);
                    hasWord = false;
                    j = wordEnd;
                } else {
                    j--;
                }

                continue;
            }

            if (!hasWord) {
                hasWord = true;
                wordEnd = j;
            }

            j--;

        }

        if (hasWord) {
            i = wordEnd+1;
        } else if(i> 0&& Character.isWhitespace(chars[i-1])) {
            i = i  - 1;
        }

        return String.valueOf(chars, 0, i);
    }

    private int rotateWord(char[] chars, int i, int j, int wordEnd) {

        int wordLen = wordEnd - j;
        for (int k = 0; k < wordLen; k++) {
            char end = chars[wordEnd];
            for (int l = wordEnd; l > i; l--) {
                chars[l] = chars[l - 1];
            }
            chars[i] = end;
        }

        char end = chars[wordEnd];
        for (int l = wordEnd; l > (i + wordLen); l--) {
            chars[l] = chars[l - 1];
        }
        chars[i + wordLen] = end;
        return i + wordLen + 1;
    }
}
