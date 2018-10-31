package com.babyachievement.top.interviews;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * date: 2018/10/31 9:42
 */
public class ContainsDuplicateIII220Test {

    @Test
    public void containsNearbyAlmostDuplicate() throws IOException {
        final ContainsDuplicateIII220 duplicateIII220 = new ContainsDuplicateIII220();
        assertTrue(duplicateIII220.containsNearbyAlmostDuplicate(new int[]{1,
                2,3,1}, 3, 0));
        assertTrue(duplicateIII220.containsNearbyAlmostDuplicate(new int[]{1,
                0,1,1}, 1, 2));
        assertFalse(duplicateIII220.containsNearbyAlmostDuplicate(new int[]{1,
                5,9,1,5,9}, 2, 3));
        assertTrue(duplicateIII220.containsNearbyAlmostDuplicate(new int[]{2,
                2}, 3, 0));
        assertFalse(duplicateIII220.containsNearbyAlmostDuplicate(new int[]{-1,2147483647},1, 2147483647));
        assertFalse(duplicateIII220.containsNearbyAlmostDuplicate(new int[]{2147483647,-2147483647}, 1, 2147483647));

        final InputStream resourceAsStream =
                ClassLoader.getSystemResourceAsStream(
                        "ContainsDuplicateIII");

        final InputStreamReader inputStreamReader = new InputStreamReader(
                resourceAsStream);
        final BufferedReader bufferedReader    = new BufferedReader(
                inputStreamReader);


        String s = bufferedReader.readLine();

        final String[] numsStr = s.split(",");

        final int[] testcase = new int[numsStr.length];
        for (int i = 0; i < testcase.length; i++) {
            testcase[i] = Integer.parseInt(numsStr[i]);
        }
        inputStreamReader.close();
        resourceAsStream.close();

        long start = System.currentTimeMillis();
        assertFalse(duplicateIII220.containsNearbyAlmostDuplicate(testcase, 10000, 0));
        System.out.println(System.currentTimeMillis()-start);
    }
}