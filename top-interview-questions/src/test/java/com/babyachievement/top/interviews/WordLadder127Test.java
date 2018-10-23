package com.babyachievement.top.interviews;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/23 16:45
 */
public class WordLadder127Test {

    @Test
    public void ladderLength() {
        final WordLadder127 wordLadder127 = new WordLadder127();
        assertThat(wordLadder127.ladderLength("hit",
                                              "cog",
                                              Arrays.asList("hot",
                                                            "dot",
                                                            "dog", "lot", "log",
                                                            "cog")), is(5));
        assertThat(wordLadder127.ladderLength("hit",
                                              "cog",
                                              Arrays.asList("hot","dot",
                                                            "dog","lot","log")), is(0));
    }
}