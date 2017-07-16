package com.babyachievement.solutions_7;

/**
 * 反转整数
 *
 * @user Alvin
 * @create 2017-07-16 18:36
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int reverse = new ReverseInteger().reverse(-123);
        System.out.println(reverse);
    }
    public int reverse(int x) {
        long result = 0;

        while (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE && x != 0) {
            result = (result* 10 + x % 10) ;
            x = x / 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0;

        return (int) result;
    }
}
