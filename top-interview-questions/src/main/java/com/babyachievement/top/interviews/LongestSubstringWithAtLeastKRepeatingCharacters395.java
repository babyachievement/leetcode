/**
 * date: 2018/10/30 18:11
 */

package com.babyachievement.top.interviews;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/
 */
public class LongestSubstringWithAtLeastKRepeatingCharacters395 {

    public int longestSubstring(String s, int k) {

        return bruteForce(s, k, 0, s.length());
    }

    public int bruteForce(String s, int k, int start, int end) {
        if(end - start<k) return 0;

        List<Integer>[] cIndexArray = new List[26];

        for (int i = 0; i < 26; i++) {
            cIndexArray[i] = new ArrayList<>();
        }

        for (int i = start; i < end; i++) {
            cIndexArray[s.charAt(i) - 'a'].add(i);
        }

        //  i valid j

        for (int i = 0; i < 26; i++) {
            if (cIndexArray[i].size() < k && cIndexArray[i].size()>0) {
                List<Integer> integers = cIndexArray[i];

                for (Integer index : integers) {
                    int left = bruteForce(s, k, start, index.intValue());
                    int right = bruteForce(s, k, index.intValue()+1, end);
                    return Math.max(left, right);
                }
            }
        }

        return end - start;

    }


    public int longestSubstring2(String s, int k) {
        if(s == null || s.length() < k)
            return 0;

        return helper(s.toCharArray(), 0, s.length()-1, k);
    }

    private int helper(char[] s, int begin, int end, int k){
        if(begin > end || end - begin + 1 < k)
            return 0;

        int[] counts = new int[26];

        for(int i = begin; i <= end; i++){
            counts[s[i]-'a']++;
        }

        for(int i = begin; i <= end; i++){
            if(counts[s[i]-'a'] < k){
                int left = helper(s, begin, i-1, k);
                int right = 0;
                int j = i + 1;
                while(j < s.length && counts[s[j]-'a'] < k) j++;
                if(end - j + 1 > left){
                    right = helper(s, j, end, k);
                }

                return Math.max(left, right);
            }
        }

        return end-begin+1;
    }

    /**
     * For each h, apply two pointer technique to find the longest substring with at least K repeating characters and the number of unique characters in substring is h.
     
     * @param s
     * @param k
     * @return
     */
    public int longestSubstring3(String s, int k) {
        char[] str = s.toCharArray();
        int[] counts = new int[26];
        int h, i, j, idx, max = 0, unique, noLessThanK;

        for (h = 1; h <= 26; h++) {
            Arrays.fill(counts, 0);
            i = 0;
            j = 0;
            unique = 0;
            noLessThanK = 0;
            while (j < str.length) {
                if (unique <= h) {
                    idx = str[j] - 'a';
                    if (counts[idx] == 0)
                        unique++;
                    counts[idx]++;
                    if (counts[idx] == k)
                        noLessThanK++;
                    j++;
                }
                else {
                    idx = str[i] - 'a';
                    if (counts[idx] == k)
                        noLessThanK--;
                    counts[idx]--;
                    if (counts[idx] == 0)
                        unique--;
                    i++;
                }
                if (unique == h && unique == noLessThanK)
                    max = Math.max(j - i, max);
            }
        }

        return max;
    }
}
