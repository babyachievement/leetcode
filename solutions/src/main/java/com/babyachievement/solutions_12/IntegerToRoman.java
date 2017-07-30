/**
 * FileName:IntegerToRoman
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午8:08
 */
package com.babyachievement.solutions_12;

/**
 * 右加左减：在一个较大的罗马数字的右边记上一个较小的罗马数字，表示大数字加小数字。在一个较大的数字的左边记上一个较小的罗马数字，
 * 表示大数字减小数字。但是，左减不能跨越等级。比如，99不可以用IC表示，用XCIX表示。
 * <p>
 * 单位限制：同样单位只能出现3次，如40不能表示为XXXX，而要表示为XL
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        while (num / 1000 > 0) {
            stringBuilder.append('M');
            num -= 1000;
        }

        if (num >= 900) {
            stringBuilder.append('C');
            stringBuilder.append('M');
            num -= 900;
        }

        while (num / 500 > 0) {
            stringBuilder.append('D');
            num -= 500;
        }

        // 450 >= num >= 400
        if (500 - num <= 100 && 500 > num) {
            stringBuilder.append('C');
            stringBuilder.append('D');
            num -= 400;
        } else {
            while (num / 100 > 0) {
                stringBuilder.append('C');
                num -= 100;
            }
        }

        if (num >= 90) {
            stringBuilder.append('X');
            stringBuilder.append('C');
            num -= 90;
        }

        if (num >= 50) {
            stringBuilder.append('L');
            num -= 50;
        }

        if (num >= 40) {
            stringBuilder.append('X');
            stringBuilder.append('L');
            num -= 40;
        } else {
            while (num / 10 > 0) {
                stringBuilder.append('X');
                num -= 10;
            }
        }

        if (num >= 9) {
            stringBuilder.append('I');
            stringBuilder.append('X');
        } else {
            if (num >= 5) {
                stringBuilder.append('V');
                num -= 5;
            }
            if (num == 4) {
                stringBuilder.append('I');
                stringBuilder.append('V');
                num -= 4;
            }

            for (int i = 0; i < num; i++) {
                stringBuilder.append('I');
            }
        }


        return stringBuilder.toString();
    }
}
