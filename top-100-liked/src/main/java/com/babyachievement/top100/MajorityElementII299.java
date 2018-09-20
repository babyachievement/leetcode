/**
 * date: 2018/9/19 21:37
 */

package com.babyachievement.top100;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/description/
 * https://leetcode.com/problems/majority-element-ii/discuss/63537/my-understanding-of-boyer-moore-majority-vote
 */
public class MajorityElementII299 {

    public List<Integer> majorityElement(int[] nums) {
        final ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int minCount = nums.length / 3 + 1;

        int     c1     = 0;
        int     c2     = 0;
        Integer major1 = null;
        Integer major2 = null;

        for (int num : nums) {
            if (major1 != null && major1.intValue() == num) {
                c1++;
            } else if (major2 != null && major2.intValue() == num) {
                c2++;
            } else if (c1 == 0 || null == major1) {
                major1 = num;
                c1++;
            } else if (c2 == 0 || null == major2) {
                major2 = num;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = c2 = 0;
        for (int num : nums) {
            if (major1 != null && major1.intValue() == num) {
                c1++;
            }

            if (major2 != null && major2.intValue() == num) {
                c2++;
            }
        }

        if (c1 >= minCount) {
            result.add(major1);
        }

        if (c2 >= minCount) {
            result.add(major2);
        }

        return result;
    }
}
