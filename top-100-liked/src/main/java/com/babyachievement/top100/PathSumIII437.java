/**
 * date: 2018/9/28 9:53
 */

package com.babyachievement.top100;

import org.babyachievement.algorithms.structure.TreeNode;

/**
 * https://leetcode.com/problems/path-sum-iii/
 */
public class PathSumIII437 {

    int total;

    public int pathSum(TreeNode root, int sum) {
        total = sum;
        return dfs(root, root, sum);
    }

    public int dfs(TreeNode current, TreeNode start, int rest) {
        int sum = 0;
        if (current != null) {
            if (current == start) {
                sum += dfs(current.left, current.left, total);
                sum += dfs(current.right, current.right, total);
            }

            sum += dfs(current.left, start, rest - current.val);
            sum += dfs(current.right, start, rest - current.val);

            if (current.val == rest) {
                sum += 1;
            }
        }

        return sum;
    }


    public int pathSum2(TreeNode root, int sum) {
        int depth = 1001;
        int[] sums = new int[depth];
        return countPaths(root, sums, 0, sum);
    }
    private int countPaths(TreeNode root, int[] sums, int index, int sum){
        if( root == null) return 0;
        int count = 0;
        sums[index] = root.val;
        if( index > 0) sums[index] += sums[index - 1];
        if( sums[index] == sum ) count++;
        for ( int i = 0; i < index; i++){
            if( sums[index] - sums[i] == sum) count++;
        }
        count += countPaths(root.left, sums, index + 1, sum);
        count += countPaths(root.right, sums, index + 1, sum);
        return count;
    }
}
