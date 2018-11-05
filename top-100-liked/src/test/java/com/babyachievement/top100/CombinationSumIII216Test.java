package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/5 11:26
 */
public class CombinationSumIII216Test {

    @Test
    public void combinationSum3() {
        final CombinationSumIII216 combinationSumIII216 = new CombinationSumIII216();
        assertThat(combinationSumIII216.combinationSum3(3, 7).size(), is(1));
        System.out.println(combinationSumIII216.combinationSum3(3, 7));
        assertThat(combinationSumIII216.combinationSum3(3, 9).size(), is(3));
        System.out.println(combinationSumIII216.combinationSum3(3, 9));
    }
}