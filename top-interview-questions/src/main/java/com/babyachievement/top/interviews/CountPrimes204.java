/**
 * date: 2018/10/31 15:13
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/count-primes/description/
 */
public class CountPrimes204 {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        // 筛掉一半偶数
        int       count    = n / 2;
        boolean[] notPrime = new boolean[n];
        // 只筛3≤i<√n奇数
        for (int i = 3; i * i < n; i += 2) {

            if (!notPrime[i]) {
                // 筛掉素数的奇数倍数
                // 从i*i开始筛
                for (int j = i * i; j < n; j += 2 * i) {
                    if (!notPrime[j]) {
                        notPrime[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}
