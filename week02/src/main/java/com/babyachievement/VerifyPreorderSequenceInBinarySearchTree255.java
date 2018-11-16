/**
 * date: 2018/11/15 17:41
 */

package com.babyachievement;

/**
 * https://www.lintcode.com/problem/verify-preorder-sequence-in-binary-search-tree/description
 */
public class VerifyPreorderSequenceInBinarySearchTree255 {
    public boolean verifyPreorder2(int[] preorder) {
        for (int i = 0; i < preorder.length; i++) {
            boolean largerMet = false;
            for (int j = i + 1; j < preorder.length; j++) {
                if (preorder[j] > preorder[i]) {
                    largerMet = true;
                } else if (largerMet) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean verifyPreorder(int[] preorder) {
        // write your code here

        return dfs(preorder, 0, preorder.length - 1, Integer.MIN_VALUE,
                   Integer.MAX_VALUE);
    }

    boolean dfs(int[] preorder, int start, int end, int low, int high) {
        if (start >= preorder.length || start > end) {
            return true;
        }


        final int v = preorder[start];
        int       i = start;
        for (; i <= end; i++) {
            if (preorder[i] > v) {
                break;
            }
        }

        return dfs(preorder, start, i - 1, low, preorder[i]) && dfs(preorder, i,
                                                                    end,
                                                                    preorder[i],
                                                                    high);
    }
}
