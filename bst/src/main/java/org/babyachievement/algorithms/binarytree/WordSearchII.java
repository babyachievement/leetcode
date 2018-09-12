package org.babyachievement.algorithms.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/word-search-ii/description/
 */
public class WordSearchII {

    /**
     * 结合Trie树是不是效果更好
     *
     * @param board
     * @param words
     * @return
     */
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) {
            return result;
        }

        if (board == null || board.length == 0 || board[0].length==0) {
            return result;
        }
        WordSearch wordSearch = new WordSearch();

        for (String word : words) {
            if (!result.contains(word)&&wordSearch.exist(board, word)) {
                result.add(word);
            }
        }

        return result;
    }
}
