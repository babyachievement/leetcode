/**
 * date: 2018/11/2 14:46
 */

package com.babyachievement.top100;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}
