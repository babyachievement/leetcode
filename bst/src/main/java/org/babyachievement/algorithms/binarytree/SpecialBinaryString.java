package org.babyachievement.algorithms.binarytree;

/**
 * https://leetcode.com/problems/special-binary-string/description/
 */
public class SpecialBinaryString {
    public String makeLargestSpecial(String S) {
        if(S==null||S.isEmpty()) return S;

        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            nextSubSpecialLength(chars, i);
        }

        // TODO
        return String.valueOf(chars);
    }

    int nextSubSpecialLength(char[] chars, int start) {
        int length = chars.length;
        if (start == length) {
            return 0;
        }

        int i = start;
        while (i < length) {
            if (isSpecialString(chars, start, i)) {
                break;
            }
        }

        if (i >= length) {
            return 0;
        }

        int nextLen = nextSubSpecialLength(chars, i + 1);

        if (nextLen > 0) {
            if (String.valueOf(chars, i+1, nextLen).compareTo(String.valueOf
                    (chars, start, i-start+1)) >0) {
                swap(chars, start, i + 1 - start, nextLen);
                return nextLen;
            }else {
                return i - start + 1;
            }
        } else {
            return i - start + 1;
        }
    }

    private void swap(char[] chars, int start, int len1, int nextLen) {
        // 循环左移

    }

    boolean isSpecialString(char[] chars, int start, int end) {
        if (start >= end) {
            return false;
        }
        int numOf1 = 0;
        int numOf0 = 0;

        for (int i = start; i <= end; i++) {
            if (chars[i] == '0') {
                numOf0++;
            } else {
                numOf1++;
            }

            if (numOf0 > numOf1) {
                return false;
            }
        }

        return numOf0 == numOf1;
    }
}
