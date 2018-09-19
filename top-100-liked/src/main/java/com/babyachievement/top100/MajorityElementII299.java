/**
 * date: 2018/9/19 21:37
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/description/
 */
public class MajorityElementII299 {
    public List<Integer> majorityElement(int[] nums) {
        final ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int minCount = nums.length/3+1;
        final int[] major = new int[nums.length / minCount];
        final int[] count = new int[nums.length / minCount];

        // TODO

        return result;
    }
}
