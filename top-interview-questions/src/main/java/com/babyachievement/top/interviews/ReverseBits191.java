/**
 * date: 2018/10/30 11:14
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/reverse-bits/description/
 */
public class ReverseBits191 {
    public int reverseBits(int n) {
        int result = 0;

        int i = 0;
        while (i<32) {
            result =  result << 1;
            result |= n & 1;
            n = n >> 1;
            i++;
        }

        return result;
    }
}
