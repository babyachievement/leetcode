/**
 * date: 2018/10/11 10:28
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/description/
 */
public class GenerateParentheses22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }

        dfs(n, n, 0, new StringBuilder(), result);
        return result;
    }

    private void dfs(int n, int restN, int leftNum, StringBuilder stringBuilder, List<String> result) {
        if (leftNum == 0 && restN == 0) {
            result.add(stringBuilder.toString());
            return;
        }


        if (leftNum > 0) {
            stringBuilder.append(')');
            dfs(n, restN, leftNum - 1, stringBuilder, result);
            stringBuilder.deleteCharAt((n - restN) * 2 - leftNum);
        }

        if (restN > 0) {
            stringBuilder.append('(');
            dfs(n, restN - 1, leftNum + 1, stringBuilder, result);
            stringBuilder.deleteCharAt((n - restN) * 2 - leftNum);
        }
    }
}
