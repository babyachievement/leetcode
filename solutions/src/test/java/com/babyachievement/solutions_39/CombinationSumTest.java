package com.babyachievement.solutions_39;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:CombinationSumTest
 * Created by HaoQiang
 * Date:17-7-31
 * Time:下午8:51
 */
public class CombinationSumTest {
    @Test
    public void combinationSum() throws Exception {
        int[] candidates = {2, 3, 6, 7};

        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> lists = combinationSum.combinationSum(candidates, 5);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

        assertThat(lists.size(), is(1));
        lists = combinationSum.combinationSum(candidates, 1);
        assertThat(lists.size(), is(0));
        lists = combinationSum.combinationSum(candidates, 7);
        assertThat(lists.size(), is(2));
    }

}