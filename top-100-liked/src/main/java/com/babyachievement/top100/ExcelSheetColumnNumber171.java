/**
 * date: 2018/10/18 11:28
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 */
public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int sum = 0;
        final int length = s.length();
        for (int i = 0; i < length; i++) {
            sum = sum*26 + (s.charAt(i)-'A'+1);
        }

        return sum;
    }
}
