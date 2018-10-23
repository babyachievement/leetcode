/**
 * date: 2018/10/23 16:48
 */

package com.babyachievement.top.interviews;

/**
 * https://leetcode.com/problems/surrounded-regions/description/
 */
public class SurroundedRegions130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }


        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                alterToOne(board, i, 0, board.length, board[0].length);
            }

            if (board[i][board[0].length - 1] == 'O') {
                alterToOne(board,
                           i,
                           board[0].length - 1,
                           board.length,
                           board[0].length);
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                alterToOne(board, 0, i, board.length, board[0].length);
            }

            if (board[board.length - 1][i] == 'O') {
                alterToOne(board,
                           board.length - 1, i, board.length, board[0].length);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                }
            }
        }
        // 从外到内
    }

    void alterToOne(char[][] vec, int i, int j, int row, int col) {
        if (i < 0 || i >= row) {
            return;
        }

        if (j < 0 || j >= col) {
            return;
        }
        if (vec[i][j] == 'O') {
            vec[i][j] = '1';
            alterToOne(vec, i - 1, j, row, col);
            alterToOne(vec, i, j - 1, row, col);
            alterToOne(vec, i + 1, j, row, col);
            alterToOne(vec, i, j + 1, row, col);
        }
    }
}
