/**
 * FileName:CombinationSum
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午8:50
 */
package com.babyachievement.solutions_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, target, 0, null, result);
        return result;
    }

    public void combinationSum(int[] candidates, int target, int i, List<Integer> r1, List<List<Integer>> result) {
        if (target == 0 && r1 != null) {
            result.add(new ArrayList<>(r1));
        }

        if (target < 0) {
            return;
        }

        for (int j = i; j < candidates.length && candidates[j] <= target; j++) {
            if (target >= candidates[j]) {
                if (r1 == null) {
                    r1 = new ArrayList<>();
                }

                r1.add(candidates[j]);
                combinationSum(candidates, target - candidates[j], j, r1, result);
                r1.remove(r1.size() - 1);
            }
        }
    }
}
