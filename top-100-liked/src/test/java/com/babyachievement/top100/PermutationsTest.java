package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * date: 2018/9/17 16:35
 */
public class PermutationsTest {

    @Test
    public void permute() {
        Permutations permutations = new Permutations();
        List<List<Integer>> result = permutations.permute(new int[]{1, 2, 4,
                5});

        assertThat(result.size(), is(24));
    }
}