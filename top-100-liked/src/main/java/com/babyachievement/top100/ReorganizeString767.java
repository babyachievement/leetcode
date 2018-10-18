/**
 * date: 2018/10/11 15:13
 */

package com.babyachievement.top100;

/**
 * https://leetcode.com/problems/reorganize-string/description/
 * @see TaskScheduler621
 */
public class ReorganizeString767 {
    public String reorganizeString(String S) {
        // TODO
        char[] chars = new char[S.length()];

        int[] c = new int[26];
        for (char t : S.toCharArray()) {
            c[t - 'A']++;
        }



        return null;
    }
}
