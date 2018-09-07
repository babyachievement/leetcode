/**
 * date: 2018/9/7 11:22
 */

package org.babyachievement.algorithms.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
 */
public class FindModeInBST {
    private int max;
    private int lastV;
    private int lastCount;
    private List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        lastV = Integer.MAX_VALUE;
        lastCount = 0;
        dfs(root);
        update();

        int[] ints = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ints[i] = result.get(i);
        }
        return ints;
    }

    /**
     * 这里必须用中序遍历
     *
     * @param root
     */
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (root.val == lastV) {
            lastCount++;
        } else {
            update();
            lastCount = 1;
            lastV = root.val;
        }

        dfs(root.right);
    }

    private void update() {
        if (max < lastCount) {
            max = lastCount;
            result.clear();
        }

        if (lastCount == max && max != 0) {
            result.add(lastV);
        }
    }
}
