package org.babyachievement.algorithms.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/word-search-ii/description/
 */
public class WordSearchIIWithTrie {
    static class TrieNode {
        boolean isLeaf;
        String value;
        TrieNode[] children = new TrieNode[26];

        public TrieNode() {
        }
    }


    private void search(char[][] board,
                        int i, int j, TrieNode current, List<String> result) {

        char c = board[i][j];

        if (c == ' ' || current == null) {
            return;
        }

        TrieNode child = current.children[c - 'a'];
        if (child != null && child.isLeaf) {
            result.add(child.value);
            child.isLeaf = false;
            child.value = "";
        }

        // 1. set visited
        board[i][j] = ' ';

        if (i > 0) {
            search(board, i - 1, j, child, result);
        }

        if (j < board[0].length - 1) {
            search(board, i, j + 1, child, result);
        }

        if (i < board.length - 1) {
            search(board, i + 1, j, child, result);
        }

        if (j > 0) {
            search(board, i, j - 1, child, result);
        }


        // 2. recover
        board[i][j] = c;
    }

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

        if (board == null || board.length == 0 || board[0].length == 0) {
            return result;
        }

        TrieNode trieRoot = buildTrie(words);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                search(board, i, j, trieRoot, result);
            }
        }

        return result;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode current = root;
            for (char c : word.toCharArray()) {
                TrieNode child = current.children[c - 'a'];
                if (child == null) {
                    child = new TrieNode();
                    current.children[c - 'a'] = child;
                }

                current = child;
            }

            if (root != current) {
                current.isLeaf = true;
                current.value = word;
            }
        }

        return root;
    }
}
