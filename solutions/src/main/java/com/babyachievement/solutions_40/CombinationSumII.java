/**
 * FileName:CombinationSumII
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午11:02
 */
package com.babyachievement.solutions_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, target, -1, null, result);

        return result;
    }

    public void combinationSum(int[] candidates, int target, int i, List<Integer> r1, List<List<Integer>> result) {
        if (target == 0 && r1 != null) {
            result.add(new ArrayList<>(r1));
        }

        if (target < 0) {
            return;
        }

        if (r1 == null) {
            r1 = new ArrayList<>();
        }

        int remove = 0;
        for (int j = i + 1; j < candidates.length && candidates[j] <= target; j++) {
            if (candidates[j] == remove)
                continue;


            if (target >= candidates[j]) {
                r1.add(candidates[j]);
                combinationSum(candidates, target - candidates[j], j, r1, result);
                remove = r1.remove(r1.size() - 1);
            }
        }
    }
}
