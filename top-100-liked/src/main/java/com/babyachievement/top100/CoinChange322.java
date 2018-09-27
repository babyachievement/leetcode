/**
 * date: 2018/9/26 18:05
 */

package com.babyachievement.top100;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/description/
 */
public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {
        final int[] mem = new int[amount + 1];

        Arrays.fill(mem, Integer.MAX_VALUE);
        mem[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && mem[i - coin] != Integer.MAX_VALUE) {
                    mem[i] = Math.min(mem[i], mem[i - coin] + 1);
                }
            }
        }


        return mem[amount] == Integer.MAX_VALUE ? -1 : mem[amount];
    }
}
