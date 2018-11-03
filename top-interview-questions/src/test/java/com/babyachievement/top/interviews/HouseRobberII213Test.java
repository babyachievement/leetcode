package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HouseRobberII213Test {

    @Test
    public void rob() {
        HouseRobberII213 robberII213 = new HouseRobberII213();
        assertThat(robberII213.rob(new int[]{2, 3, 2}), is(3));
        assertThat(robberII213.rob(new int[]{1, 2, 3, 1}), is(4));
        assertThat(robberII213.rob(new int[]{1, 2, 1, 1}), is(3));
        int[] nums = new int[]{
                94,
                40,
                49,
                65,
                21,
                21,
                106,
                80,
                92,
                81,
                679,
                4,
                61,
                6,
                237,
                12,
                72,
                74,
                29,
                95,
                265,
                35,
                47,
                1,
                61,
                397,
                52,
                72,
                37,
                51,
                1,
                81,
                45,
                435,
                7,
                36,
                57,
                86,
                81,
                72
        };
        System.out.println(robberII213.rob(nums));
        int[] nums2 = new int[]{
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };
        assertThat(robberII213.rob(nums2), is(0));

    }
}