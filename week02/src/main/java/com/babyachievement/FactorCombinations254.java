package com.babyachievement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.lintcode.com/problem/factor-combinations/description
 */
public class FactorCombinations254 {
    /**
     * @param n: a integer
     * @return: return a 2D array
     */
    public List<List<Integer>> getFactors(int n) {

        List<List<Integer>> res = new ArrayList<>();
        dfs(n, new ArrayList<Integer>(), 2, res, n);
        return res;
    }

    private void dfs(int n, ArrayList<Integer> subset,
                     int startIndex,
                     List<List<Integer>> res, int origin) {
        if (n == 1) {
            if (subset.get(subset.size() - 1) == origin) {
                return;
            }
            res.add(new ArrayList<>(subset));
            return;
        }

        for (int i = startIndex; i <= n; i++) {
            if (n % i == 0) {
                if (!subset.isEmpty() && i < subset.get(subset.size() - 1)) {
                    return;
                }
                subset.add(i);
                dfs(n / i, subset, i, res, origin);
                subset.remove(subset.size() -1);
            }
        }
    }
}
