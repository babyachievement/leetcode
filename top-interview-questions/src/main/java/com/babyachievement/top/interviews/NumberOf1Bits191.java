/**
 * date: 2018/10/31 13:46
 */

package com.babyachievement.top.interviews;

public class NumberOf1Bits191 {
    public int hammingWeight(int n) {
        int total = 0;
        while (n != 0) {
            total++;
            n = n & (n - 1);
        }
        return total;
    }

    public boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
    }

}
