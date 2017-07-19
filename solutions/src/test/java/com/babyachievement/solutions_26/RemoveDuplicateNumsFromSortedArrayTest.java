package com.babyachievement.solutions_26;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:RemoveDuplicateNumsFromSortedArrayTest
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午11:37
 */
public class RemoveDuplicateNumsFromSortedArrayTest {
    @Test
    public void removeDuplicates() throws Exception {
        RemoveDuplicateNumsFromSortedArray removeDuplicateNums = new RemoveDuplicateNumsFromSortedArray();
        int[] nums = {1};

        int result = removeDuplicateNums.removeDuplicates(nums);
        assertThat(result, is(1));
        int[] nums2 = {1, 1, 2};
        result = removeDuplicateNums.removeDuplicates(nums2);
        assertThat(result, is(2));
        assertThat(nums2[1], is(2));
    }

}