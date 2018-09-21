package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/21 11:11
 */
public class MaximalSquare221Test {

    @Test
    public void maximalSquare() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0',},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        final MaximalSquare221 maximalSquare221 = new MaximalSquare221();
        assertThat(maximalSquare221.maximalSquare(matrix), is(4));
    }
}