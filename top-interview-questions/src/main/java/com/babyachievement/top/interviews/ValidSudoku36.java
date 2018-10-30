/**
 * date: 2018/10/22 14:37
 */

package com.babyachievement.top.interviews;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/valid-sudoku/description/
 */
public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            HashSet<Character> rows    = new HashSet<>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube    = new HashSet<Character>();
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }

    /**
     * Collect the set of things we see, encoded as strings. For example:
     *
     * '4' in row 7 is encoded as "(4)7".
     * '4' in column 7 is encoded as "7(4)".
     * '4' in the top-right block is encoded as "0(4)2".
     * Scream false if we ever fail to add something because it was already added (i.e., seen before).
     */
    public boolean isValidSudoku2(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
