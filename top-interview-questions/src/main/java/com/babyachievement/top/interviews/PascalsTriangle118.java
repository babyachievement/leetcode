/**
 * date: 2018/10/23 9:53
 */

package com.babyachievement.top.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/description/
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows < 1) {
            return result;
        }

        List<Integer> level1 = new ArrayList<>();
        level1.add(1);
        result.add(level1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> level = new ArrayList<>();
            level.add(1);
            final List<Integer> lastLevel = result.get(i - 1);
            int pre = lastLevel.get(0);
            int current = 0;
            for (int j = 1; j <= i - 1; j++) {
                current = lastLevel.get(j);
                level.add(pre + current);
                pre = current;
            }

            level.add(1);
            result.add(level);
        }

        return result;
    }
}
