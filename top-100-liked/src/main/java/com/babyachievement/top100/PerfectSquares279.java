/**
 * date: 2018/9/25 18:16
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/perfect-squares/description/
 */
public class PerfectSquares279 {
    public int numSquares2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for(int i = 1; i <= n; ++i) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j*j >= 0) {
                min = Math.min(min, dp[i - j*j] + 1);
                ++j;
            }
            dp[i] = min;
        }
        return dp[n];

    }

    public int numSquare3(int n) {
        int[] record = new int[n+1];
        for(int i=0;i<=n;i++){
            record[i] = i;
            for(int j=1;j*j<=i;j++){
                record[i] = Math.min(record[i-j*j]+1,record[i]);
            }
        }
        return record[n];
    }
    public int numSquares(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        final Double sqrt = Math.sqrt(n);

        int min = Integer.MAX_VALUE;
        for (int i = sqrt.intValue(); i >= 1; i--) {
            if (n - i * i >= 0) {
                min = Math.min(min, 1 + numSquares(n - i * i));
            }

            if (n - i * i == 0) {
                break;
            }
        }

        return min;
    }
}
