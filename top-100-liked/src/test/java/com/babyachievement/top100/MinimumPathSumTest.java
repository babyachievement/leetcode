package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/18 13:20
 */
public class MinimumPathSumTest {

    @Test
    public void minPathSum() {
        int[][] matrix = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        MinimumPathSum minimumPathSum = new MinimumPathSum();
        assertThat(minimumPathSum.minPathSum(matrix), is(7));

    }
}