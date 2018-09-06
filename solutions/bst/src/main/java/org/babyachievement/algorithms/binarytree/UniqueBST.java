/**
 * date: 2018/9/5 14:37
 */

package org.babyachievement.algorithms.binarytree;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/description/
 */
public class UniqueBST {

    public int numTrees(int n) {
        int[] solutions = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            solutions[i] = -1;
        }

        return possibilitiesOf(n, solutions);
    }

    private int possibilitiesOf(int n, int[] solutions) {
        if (n < 0) {
            throw new IllegalArgumentException("n should not be negative");
        }

        /**
         * base
         */
        if (n == 0 || n == 1) {
            return 1;
        }

        if (solutions[n] != -1) {
            return solutions[n];
        }

        int possibilities = 0;
        for (int root = 1; root <= n; root++) {
            if (solutions[root - 1] == -1) {
                solutions[root - 1] = possibilitiesOf(root - 1, solutions);
            }

            if (solutions[n - root] == -1) {
                solutions[n - root] = possibilitiesOf(n - root, solutions);
            }

            possibilities += solutions[root - 1] * solutions[n - root];
        }

        solutions[n] = possibilities;

        return possibilities;
    }

    public int numTreesWithoutRecursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should not be negative");
        }

        int [] solutions = new int[n+1];
        solutions[0] = solutions[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                solutions[i] += solutions[j - 1] * solutions[i - j];
            }
        }

        return solutions[n];
    }
}
