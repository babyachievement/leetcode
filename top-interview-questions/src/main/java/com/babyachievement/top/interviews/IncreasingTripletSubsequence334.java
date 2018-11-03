/**
 * date: 2018/11/2 11:24
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/increasing-triplet-subsequence/description/
 */
public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {

        int i = 0, j = 0;

        for (int l = 1; l < nums.length; l++) {
            if (j != 0 && nums[l] > nums[j]) {
                return true;
            }
            if (nums[l] < nums[i]) {
                i = l;
            }

            if (nums[l] > nums[i]) {
                if (j == 0) {
                    j = l;
                }
                else {
                    if (nums[l] < nums[j]) {
                        j = l;
                    } else if (nums[l] > nums[j]) {
                        return true;
                    }
                }
            }


        }


        return false;
    }

    public boolean increasingTriplet2(int[] nums) {
        if(nums == null || nums.length < 3)
            return false;

        int min = nums[0];
        int max = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>max)
                return true;
            else if(nums[i]>min && nums[i] < max)
                max = nums[i];
            else if(nums[i]<min)
                min = nums[i];
        }
        return false;
    }
}
