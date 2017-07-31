/**
 * FileName:CombinationSum
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午8:50
 */
package com.babyachievement.solutions_39;

import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        return combinationSum(candidates, target, candidates.length - 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target, int i) {
        if (target == 0) {
            List<Integer> r1 = new ArrayList<>();
            List<List<Integer>> t = new ArrayList<>();
            t.add(r1);
            return t;
        }

        if (candidates[0] > target) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int j = i; j > -1; j--) {
            if (target >= candidates[j]) {
                List<List<Integer>> tempLists = combinationSum(candidates, target - candidates[j], j);
                if (null != tempLists)
                if (tempLists != null) {
                    for (List<Integer> tempList : tempLists) {
                        tempList.add(candidates[j]);
                        Collections.sort(tempList);
                        result.add(tempList);
                    }
                }
            }
        }

        return result;
    }
}
