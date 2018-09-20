package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/20 16:13
 */
public class NumberofIslands200Test {

    @Test
    public void numIslands() {
        final char[][] data = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        final NumberofIslands200 numberofIslands200 = new NumberofIslands200();

        assertThat(numberofIslands200.numIslands(data), is(1));

        final char[][] data2 =
                {{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};
        assertThat(numberofIslands200.numIslands(data2), is(1));

        final char[][] data3 =
                {{'1', '0', '1', '1', '1'}, {'1', '0', '1', '0', '1'}, {'1', '1', '1',
                        '0', '1'}};
        assertThat(numberofIslands200.numIslands(data3), is(1));
    }
}