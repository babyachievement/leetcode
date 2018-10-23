package com.babyachievement.top.interviews;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * date: 2018/10/23 16:50
 */
public class SurroundedRegions130Test {

    @Test
    public void solve() throws IOException {
        final SurroundedRegions130 surroundedRegions130 = new SurroundedRegions130();
        char[][] array = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        surroundedRegions130.solve(array);
        assertArrayEquals(array[0], new char[]{'X', 'X', 'X', 'X'});
        assertArrayEquals(array[1], new char[]{'X', 'O', 'O', 'X'});
        assertArrayEquals(array[2], new char[]{'X', 'O', 'O', 'X'});
        assertArrayEquals(array[3], new char[]{'X', 'O', 'X', 'X'});

        final InputStream resourceAsStream =
                ClassLoader.getSystemResourceAsStream(
                        "SurroundedRegions");

        final InputStreamReader inputStreamReader = new InputStreamReader(
                resourceAsStream);
        final BufferedReader    bufferedReader    = new BufferedReader(
                inputStreamReader);

        List<String> lines = new ArrayList<>();

        String s;
        while ((s = bufferedReader.readLine()) != null) {
            lines.add(s);
        }

        final char[][] chars = new char[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            chars[i] = lines.get(i).toCharArray();
        }

        surroundedRegions130.solve(chars);
    }
}