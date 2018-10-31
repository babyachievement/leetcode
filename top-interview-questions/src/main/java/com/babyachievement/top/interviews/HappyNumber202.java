/**
 * date: 2018/10/31 15:05
 */

package com.babyachievement.top.interviews;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber202 {
    public boolean isHappy(int n) {
        Set<Integer> integers = new HashSet<>();
        return check(n, integers);
    }

    private boolean check(int n, Set<Integer> integers) {
        if (n == 1) {
            return true;
        }

        if (integers.contains(n)) {
            return false;
        }

        integers.add(n);

        int sum  = 0;
        int temp = n;
        while (temp != 0) {
            sum += (temp % 10) * (temp % 10);
            temp = temp / 10;
        }

        return check(sum, integers);
    }
}
