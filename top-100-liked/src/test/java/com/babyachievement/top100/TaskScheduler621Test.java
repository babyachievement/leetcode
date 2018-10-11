package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/11 14:42
 */
public class TaskScheduler621Test {

    @Test
    public void leastInterval() {
        final TaskScheduler621 taskScheduler621 = new TaskScheduler621();
        assertThat(taskScheduler621.leastInterval(new char[]{'A', 'A', 'A', 'B',
                'B', 'B'}, 2), is(8));

        System.out.println(taskScheduler621.leastInterval("AACCCEEBBDD"
                                                                  .toCharArray(), 2));
    }
}