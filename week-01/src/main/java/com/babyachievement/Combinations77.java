package com.babyachievement;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/combinations/description/
 */
public class Combinations77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(n, k, 1, 0, new ArrayList<>(), result);

        return result;
    }

    void combine(int n, int k, int current, int c, List<Integer> path, List<List<Integer>> result) {
        if (c == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = current; i <= n; i++) {
            path.add(i);
            combine(n, k, i + 1, c + 1, path, result);
            path.remove(c);
        }
    }
}
