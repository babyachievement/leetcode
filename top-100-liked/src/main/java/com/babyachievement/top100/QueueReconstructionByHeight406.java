/**
 * date: 2018/9/27 18:00
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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


        boolean[] used = new boolean[people.length];

        int[][] result = new int[people.length][2];

        for (int[] person : people) {
            int preNum = person[1];


            int i = 0;
            for (; preNum != 0 || used[i]; i++) {
                if (!used[i]) {
                    preNum--;
                } else if (result[i][0] >= person[0]) {
                    preNum--;
                }
            }

            result[i] = person;
            used[i] = true;
        }

        return result;
    }

    public int[][] reconstructQueue2(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                if (p1[0] == p2[0]) {
                    return p1[1] - p2[1];
                } else {
                    return p2[0] - p1[0];
                }
            }
        });

        List<int[]> res = new ArrayList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }
        return res.toArray(new int[0][0]);
    }
}
