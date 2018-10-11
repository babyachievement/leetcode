/**
 * date: 2018/10/11 9:56
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
public class LetterCombinationsPhoneNumber17 {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        final char[] digitChars = digits.toCharArray();
        letterCom(digitChars, 0, new StringBuilder(), result);
        return result;
    }

    public void letterCom(char[] digitChars, int current, StringBuilder
            stringBuilder, List<String> result) {
        if (current == digitChars.length) {
            result.add(stringBuilder.toString());
            return;
        }

        final char digitChar   = digitChars[current];
        final int  offset      = digitChar - '2';
        int        len         = 3;
        int        startOffset = offset * 3;

        if (offset == 5) {
            len = 4;
        } else if (offset == 6) {
            startOffset = offset * 3 + 1;
        } else if (offset == 7) {
            startOffset = offset * 3 + 1;
            len = 4;
        }

        for (byte i = 0; i < len; i++) {
            stringBuilder.append((char) (startOffset + 'a' + i));
            letterCom(digitChars, current + 1, stringBuilder, result);
            stringBuilder.deleteCharAt(current);
        }
    }
}
