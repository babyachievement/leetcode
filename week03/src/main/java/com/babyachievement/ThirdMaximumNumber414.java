/**
 * date: 2019/3/8 10:00
 */

package com.babyachievement;

public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
        int max, second, third;
        max = nums[0];
        second = third = Integer.MIN_VALUE;


        int distinct = 1;
        boolean min_int_avail = false;
        for (int i = 1; i < nums.length; i++) {
            if (max!=nums[i]&&!min_int_avail&&nums[i] == Integer.MIN_VALUE) {
                distinct++;
                min_int_avail = true;
            }
            if (nums[i] == max || nums[i] == second || nums[i] == third) {
                continue;
            }

            distinct++;
            if (nums[i] > max) {
                third = second;
                second = max;
                max = nums[i];

            } else if (nums[i] > second) {
                third = second;
                second = nums[i];

            } else if (nums[i] > third) {
                third = nums[i];
            }
        }

        if (distinct >= 3) {
            return third;
        } else {
            return max;
        }
    }
}
