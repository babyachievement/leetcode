/**
 * FileName:Constant
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午9:02
 */
package com.babyachievement.solutions_12;

public class Constant {
    public String intToRoman(int num) {
        if (num <= 0) return "";
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < nums.length) {
            if (num >= nums[i]) {
                sb.append(romans[i]);
                num -= nums[i];
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
