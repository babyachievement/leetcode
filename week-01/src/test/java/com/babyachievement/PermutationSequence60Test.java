package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/6 18:10
 */
public class PermutationSequence60Test {

    @Test
    public void getPermutation() {
        final PermutationSequence60 permutationSequence60 = new PermutationSequence60();
        assertThat(permutationSequence60.getPermutation(3, 3), is("213"));
        assertThat(permutationSequence60.getPermutation(4, 9), is("2314"));
    }
}