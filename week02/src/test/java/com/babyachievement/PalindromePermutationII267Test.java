package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PalindromePermutationII267Test {

    @Test
    public void generatePalindromes() {
        PalindromePermutationII267 permutationII267 = new PalindromePermutationII267();
        assertThat(permutationII267.generatePalindromes("aabb").size(), is(2));
        assertThat(permutationII267.generatePalindromes("abc").size(), is(0));
    }
}