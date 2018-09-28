/**
 * date: 2018/9/28 13:17
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class FindAllNumbersDisappearedInArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        final List<Integer> result = new ArrayList<>();
        int                 i      = 0;
        while (i < nums.length) {
            int target = nums[i];
            while (target != 0) {
                int temp = nums[target - 1];
                nums[target - 1] = 0;
                target = temp;
            }

            i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result.add(i+1);
            }
        }

        return result;
    }
}
