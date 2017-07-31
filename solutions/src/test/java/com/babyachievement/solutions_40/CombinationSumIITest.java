package com.babyachievement.solutions_40;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:CombinationSumIITest
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午11:02
 */
public class CombinationSumIITest {
    @Test
    public void combinationSum2() throws Exception {
        CombinationSumII combinationSumII = new CombinationSumII();
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> lists = combinationSumII.combinationSum2(nums, 8);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

        int[] nums2 = {2, 2, 2};
        lists = combinationSumII.combinationSum2(nums2, 4);
        assertThat(lists.size(), is(1));
    }

}