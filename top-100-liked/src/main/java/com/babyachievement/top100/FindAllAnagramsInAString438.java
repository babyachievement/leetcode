/**
 * date: 2018/9/28 11:31
 */

package com.babyachievement.top100;


import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 */
public class FindAllAnagramsInAString438 {
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> integers = new ArrayList<>();

        int hash = calHash(p, 0, p.length());

        final char[] chars = p.toCharArray();

        int i = 0;

        while (i <= s.length() - p.length()) {
            boolean missed = false;
            for (int j = 0; j < p.length(); j++) {
                if (!charIn(s.charAt(i++), chars)) {
                    missed = true;
                    break;
                }
            }

            if (!missed) {
                if (calHash(s, i - p.length(), i) == hash) {
                    integers.add(i - p.length());
                }

                i = i - p.length() + 1;
            }
        }

        return integers;
    }

    public int calHash(String s, int start, int end) {
        int key = 1;
        for (int i = start; i < end; i++) {
            key *= prime[s.charAt(i) - 'a'];
        }

        return key;
    }

    public boolean charIn(char c, char[] chars) {
        for (char aChar : chars) {
            if (c == aChar) {
                return true;
            }
        }

        return false;
    }


    public List<Integer> findAnagrams2(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        if(s == null || p == null) return result;
        int left = 0,right =0,count = p.length();
        int[] map = new int[26];
        char[] sc = s.toCharArray();
        for (char c : p.toCharArray()) map[c-'a'] ++;
        while (right < s.length()) {
            if ((map[sc[right++]-'a']--)>=1) count --;
            if (count == 0) result.add(left);
            if (right - left == p.length() && map[sc[left++]-'a']++ >=0) count++;
        }
        return result;

    }
}
