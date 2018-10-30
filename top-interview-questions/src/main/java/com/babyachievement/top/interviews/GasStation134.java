/**
 * date: 2018/10/30 11:07
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/gas-station/description/
 */
public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] < cost[i]) {
                continue;
            } else {
                if (bruteForce(0, i, 0, gas, cost)) {
                    return i;
                }
            }
        }
        return -1;
    }

    boolean bruteForce(int station, int index, int avail, int[] gas, int[]
            cost) {

        if (avail < 0) {
            return false;
        }

        if (station == gas.length) {
            return true;
        }

        return bruteForce(station + 1, (index + 1) % gas.length,
                          avail + gas[index] - cost[index], gas, cost);

    }


    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int length  = gas.length;
        int net_gas = 0;
        for (int i = 0; i < length; i++) {
            net_gas += gas[i];
            net_gas -= cost[i];
        }
        if (net_gas < 0) {
            return -1;
        }
        for (int i = 0; i < length; ) {
            net_gas = 0;
            int start = i;
            while (i < length && net_gas >= 0) {
                net_gas += gas[(i) % length];
                net_gas -= cost[(i) % length];
                i++;
            }
            if (i == length && net_gas >= 0) {
                return start;
            }
        }
        return -1;
    }
}
