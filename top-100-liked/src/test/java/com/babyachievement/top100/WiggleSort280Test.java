package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

public class WiggleSort280Test {

    @Test
    public void wiggleSort() {
        WiggleSort280 wiggleSort280 = new WiggleSort280();
        int[] nums = {3, 5, 2, 1, 6, 4};
        wiggleSort280.wiggleSort(nums);
        assertTrue(isWiggleSort(nums));

        int[] nums2 = new int[]{1, 5, 1, 1, 6, 4};
        wiggleSort280.wiggleSort(nums2);
        assertTrue(isWiggleSort(nums2));
    }

    boolean isWiggleSort(int nums[]) {
        for (int i = 0; i < nums.length; i+=2) {
            if (i != 0) {
                if(i+1 <= nums.length-1) {
                    if (nums[i] > nums[i + 1] || nums[i] > nums[i - 1]) {
                        return false;
                    }
                }else {
                    if (nums[i] > nums[i - 1]) {
                        return false;
                    }
                }
            }else {
                if (2 <= nums.length && nums[0] > nums[1]) {
                    return false;
                }
            }
        }

        return true;

    }
}