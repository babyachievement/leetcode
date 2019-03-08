package com.babyachievement;

import java.util.Collections;
import java.util.List;

/**
 * https://www.lintcode.com/problem/palindrome-permutation-ii/description
 */
public class PalindromePermutationII267 {
    /**
     * @param s: the given string
     * @return: all the palindromic permutations (without duplicates) of it
     */
    public List<String> generatePalindromes(String s) {
        // write your code here

        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count[chars[i]-'a']++;
        }

        int oddCount = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i]%2==1){
                oddCount++;
            }
        }

        if (oddCount > 1) {
            return Collections.emptyList();
        }



        // TODO

        return null;
    }
}
