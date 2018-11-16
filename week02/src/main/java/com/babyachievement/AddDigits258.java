/**
 * date: 2018/11/16 10:03
 */

package com.babyachievement;

/**
 * https://leetcode.com/problems/add-digits/description/
 */
public class AddDigits258 {
    public int addDigits(int num) {
        int n = num;
        while (n>10) {
            int i = n;
            n = 0;
            while (i > 0) {
                n += i % 10;
                i = i / 10;
            }
        }

        return n;
    }

    public int addDigits2(int num) {
        return 1 + (num - 1) % 9;
    }


}
