/**
 * date: 2019/3/8 14:28
 */

package com.babyachievement;

public class BrokenCalculator991 {
    public int brokenCalc(int X, int Y) {
        int count = 0;

        while (Y > X) {
            count++;
            if (Y % 2 == 0) {
                Y /= 2;
            } else {
                Y += 1;
            }
        }

        return count + X - Y ;
    }
}
