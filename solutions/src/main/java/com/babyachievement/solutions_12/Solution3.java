/**
 * FileName:Solution3
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午9:05
 */
package com.babyachievement.solutions_12;

public class Solution3 {
    public static final int[] intDict = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static final String[] romanDict = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        int length = intDict.length;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (intDict[i] <= num) {
                stringBuilder.append(romanDict[i]).append(intToRoman(num - intDict[i]));
                break;
            }
        }

        return stringBuilder.toString();
    }
}
