/**
 * date: 2018/10/19 16:47
 */

package com.babyachievement.top.interviews;

public class Sqrt69 {
    public int mySqrt(int x) {
        int lo = 1, hi = x;

        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;

            if (mi <= x / mi) {
                lo = mi + 1;
            }
            else {
                hi = mi;
            }
        }

        if (x % lo == 0 && x / lo == lo)
            return lo;

        return lo-1;
    }
}
