package org.babyachievement.algorithms.binarytree;

/**
 * https://leetcode.com/problems/word-search/description/
 */
public class WordSearch {

    int m;
    int n;

    public boolean exist(char[][] board, String word) {
        if (null == board || word == null || word.isEmpty()) {
            return false;
        }

        boolean[][] used = new boolean[board.length][board[0].length];


        m = board.length;
        n = board[0].length;

        char[] charArray = word.toCharArray();

        for(int i=0; i<m; i++) {
            for(int j=0; j<n;j++) {
                if (exist(board, used, charArray, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;

    }

    private boolean exist(char[][] board, boolean[][] mem, char[] charArray, int i, int j, int index) {
        if (index == charArray.length) {
            return true;
        }

        if (i >= m || i < 0) {
            return false;
        }

        if (j >= n || j < 0) {
            return false;
        }


        if (mem[i][j] || board[i][j] != charArray[index]) {
            return false;
        }

        mem[i][j] = true;
        // up -> right -> down -> left
        boolean found = exist(board, mem, charArray, i - 1, j, index + 1)
                || exist(board, mem, charArray, i, j + 1, index + 1)
                || exist(board, mem, charArray, i + 1, j, index + 1)
                || exist(board, mem, charArray, i, j - 1, index + 1);


        // recover
        if (!found) mem[i][j] = false;


        return found;
    }
}
