package com.babyachievement.solutions_9;

/**
 * 回文数判断
 * https://leetcode.com/problems/palindrome-number/#/description
 * <p>
 * 这一题提交了两次，报出
 * Status: Wrong Answer
 * <p>
 * Input:	-2147447412
 * <p>
 * Output:	true
 * <p>
 * Expected:	false
 * <p>
 * 原来OJ上将负数不当做回文
 *
 * @user Alvin
 * @create 2017-07-17 20:00
 */

public class PalindromeNumber {

    public static void main(String[] args) {

    }

    /**
     * 如果一个数反过来的值与之相等则是回文数
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int old = x;
        int temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }

        return temp == old;
    }
}
