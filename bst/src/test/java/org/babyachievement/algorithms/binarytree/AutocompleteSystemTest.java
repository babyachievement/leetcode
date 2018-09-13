package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AutocompleteSystemTest {

    @Test
    public void input() {
        AutocompleteSystem autocompleteSystem = new AutocompleteSystem(new String[]{"i love you", "island", "ironman", "i love leetcode"}, new int[]{5, 3, 2, 2});

        List<String> result = autocompleteSystem.input('i');
        assertThat(result.size(), is(3));
        assertTrue(result.containsAll(Arrays.asList("i love you", "island",  "i love leetcode")));

        result = autocompleteSystem.input(' ');
        assertThat(result.size(), is(2));
        assertThat(result.get(0), is("i love you"));
        assertTrue(autocompleteSystem.input('a').isEmpty());

        assertTrue(autocompleteSystem.input('#').isEmpty());
    }
}