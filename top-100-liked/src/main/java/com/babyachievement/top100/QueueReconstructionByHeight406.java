/**
 * date: 2018/9/27 18:00
 */

package com.babyachievement.top100;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/queue-reconstruction-by-height/description/
 */
public class QueueReconstructionByHeight406 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        // TODO
        return null;
    }
}
