/**
 * date: 2019/3/6 18:10
 */

package com.babyachievement;

import java.util.Arrays;

public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;

        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                j++;
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}
