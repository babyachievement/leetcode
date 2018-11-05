/**
 * date: 2018/11/2 14:44
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum-iii/description/
 */
public class CombinationSumIII216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>>
                result = new ArrayList<>();
        combinationSum3(k, n, 0, 1, path, result);
        return result;
    }

    public void combinationSum3(int k, int n, int currentNum, int start,
                                List<Integer> path, List<List<Integer>>
                                        result) {
        if (n == 0 && currentNum == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (start > 9 || n < 0 || start > n) {
            return;
        }




        if (currentNum > k) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            path.add(i);
            combinationSum3(k, n - i, currentNum + 1, i + 1, path, result);
            path.remove(currentNum);
        }
    }
}
