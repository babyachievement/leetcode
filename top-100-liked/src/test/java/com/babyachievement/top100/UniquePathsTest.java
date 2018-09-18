package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/18 10:36
 */
public class UniquePathsTest {

    @Test
    public void uniquePaths() {
        UniquePaths uniquePaths = new UniquePaths();
        assertThat(uniquePaths.uniquePaths(3, 2), is(3));
        assertThat(uniquePaths.uniquePaths(7, 3), is(28));
//        assertThat(uniquePaths.findPath(6, 1,7, 3), is(1));
//        assertThat(uniquePaths.findPath(5, 2,7, 3), is(1));
//        assertThat(uniquePaths.findPath(5, 1,7, 3), is(2));
//        assertThat(uniquePaths.findPath(4, 1,7, 3), is(3));

        System.out.println(uniquePaths.uniquePaths(23, 12));
    }
}