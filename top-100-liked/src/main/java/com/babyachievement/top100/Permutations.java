/**
 * date: 2018/9/17 16:19
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/description/
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        ArrayList<Integer> initial = new ArrayList<>();
        initial.add(nums[0]);

        result.add(initial);

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            List<List<Integer>> temp = new ArrayList<>(result.size());

            Iterator<List<Integer>> iterator = result.iterator();
            while (iterator.hasNext()) {
                List<Integer> next = iterator.next();
                temp.add(next);
                iterator.remove();
            }

            for (List<Integer> integers : temp) {
                for (int j = 0; j <= i; j++) {
                    ArrayList<Integer> newList = new ArrayList<>(integers);
                    newList.add(j, current);
                    result.add(newList);
                }
            }

        }


        return result;
    }

    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};//最多10609个z

}
