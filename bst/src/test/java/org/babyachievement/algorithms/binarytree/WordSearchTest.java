package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {

    @Test
    public void exist() {
        char[][] board =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };


        /**
         * Given word = "ABCCED", return true.
         Given word = "SEE", return true.
         Given word = "ABCB", return false.
         */
        WordSearch wordSearch = new WordSearch();
        assertTrue(wordSearch.exist(board, "ABCCED"));
        assertTrue(wordSearch.exist(board, "SEE"));
        assertFalse(wordSearch.exist(board, "ABCB"));

    }
}