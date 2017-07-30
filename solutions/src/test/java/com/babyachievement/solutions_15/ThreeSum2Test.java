package com.babyachievement.solutions_15;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:ThreeSum2Test
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午10:48
 */
public class ThreeSum2Test {

    @Test
    public void test3() throws Exception {
        int[] S = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        ThreeSum2 threeSum = new ThreeSum2();
        List<List<Integer>> lists = threeSum.threeSum(S);
        System.out.println(lists);
    }

    @Test
    public void test4() throws Exception {
        int[] S = {2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4};
        ThreeSum2 threeSum = new ThreeSum2();
        List<List<Integer>> lists = threeSum.threeSum(S);
        System.out.println(lists);
    }

    @Test
    public void test5() throws Exception {
        int[] S = {0, 0, 0, 0};
        ThreeSum2 threeSum = new ThreeSum2();
        List<List<Integer>> lists = threeSum.threeSum(S);
        assertThat(lists.size(), is(1));
    }

    @Test
    public void test6() throws Exception {
        int[] S = {-5, 1, -3, -1, -4, -2, 4, -1, -1};
        ThreeSum2 threeSum = new ThreeSum2();
        List<List<Integer>> lists = threeSum.threeSum(S);
        assertThat(lists.size(), is(2));
    }

}