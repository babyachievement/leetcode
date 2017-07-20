package com.babyachievement.solutions_26;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:RemoveDuplicateNumsFromSortedArray2Test
 * Created by babyachievement
 * Date:17-7-20
 * Time:上午7:41
 */
public class RemoveDuplicateNumsFromSortedArray2Test {
    @Test
    public void removeDuplicates() throws Exception {
        RemoveDuplicateNumsFromSortedArray2 removeDuplicateNums = new RemoveDuplicateNumsFromSortedArray2();
        int[] nums = {1};

        int result = removeDuplicateNums.removeDuplicates(nums);
        assertThat(result, is(1));
        int[] nums2 = {1, 1, 2};
        result = removeDuplicateNums.removeDuplicates(nums2);
        assertThat(result, is(2));
        assertThat(nums2[1], is(2));
    }

}