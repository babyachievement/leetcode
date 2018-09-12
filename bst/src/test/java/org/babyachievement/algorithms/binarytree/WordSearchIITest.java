package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/12 14:25
 */
public class WordSearchIITest {

    @Test
    public void findWords() {
        char borad[][] = {
                {
                        'o', 'a', 'a', 'n'
                },
                {
                        'e', 't', 'a', 'e'
                },
                {
                        'i', 'h', 'k', 'r'
                },
                {
                        'i', 'f', 'l', 'v'
                }
        };

        String[] words = {"oath","pea","eat","rain"};
        WordSearchII wordSearchII = new WordSearchII();
        assertThat(wordSearchII.findWords(borad, words).size(), is(2));
    }
}