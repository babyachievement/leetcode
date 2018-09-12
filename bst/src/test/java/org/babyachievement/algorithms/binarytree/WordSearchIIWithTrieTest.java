package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * date: 2018/9/12 17:56
 */
public class WordSearchIIWithTrieTest {

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

        String[] words = {"oath","pea","eat","rain", "eat"};
        WordSearchIIWithTrie wordSearchIIWithTrie = new WordSearchIIWithTrie();
        List<String> words1 = wordSearchIIWithTrie.findWords(borad, words);
        System.out.println(words1);
    }
}