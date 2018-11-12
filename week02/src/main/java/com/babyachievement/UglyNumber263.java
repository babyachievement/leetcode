package com.babyachievement;

/**
 * https://leetcode.com/problems/ugly-number/description/
 */
public class UglyNumber263 {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        for (int i = 2; i < 6; i++) {
            while(num % i == 0) num /= i;
        }
        return num == 1;
    }
}
