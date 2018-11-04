/**
 * date: 2018/11/2 14:35
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/game-of-life/description/
 */
public class GameOfLife289 {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int aliveNeighbors = aliveNeighbor(board, i, j);

                if (board[i][j] == 0) {
                    if (aliveNeighbors == 3) {
                        board[i][j] = 2;
                    }
                } else if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                    board[i][j] = -1;
                }

            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 0) {
                    if (board[i][j] == -1) {
                        board[i][j] = 0;
                    } else {
                        board[i][j] = 1;
                    }
                }
            }
        }

    }

    int aliveNeighbor(int[][] board, int i, int j) {
        int count = 0;

        if (isAlive(board, i - 1, j - 1)) {
            count++;
        }

        if (isAlive(board, i - 1, j)) {
            count++;
        }

        if (isAlive(board, i - 1, j + 1)) {
            count++;
        }

        if (isAlive(board, i, j - 1)) {
            count++;
        }

        if (isAlive(board, i, j + 1)) {
            count++;
        }

        if (isAlive(board, i + 1, j - 1)) {
            count++;
        }

        if (isAlive(board, i + 1, j)) {
            count++;
        }


        if (isAlive(board, i + 1, j + 1)) {
            count++;
        }

        return count;
    }

    boolean isAlive(int[][] board, int i, int j) {
        if (i < 0 || i >= board.length) {
            return false;
        }

        if (j < 0 || j >= board[0].length) {
            return false;
        }

        // 2 表示dead-> live的
        return board[i][j] != 0 && board[i][j] != 2;
    }
}
