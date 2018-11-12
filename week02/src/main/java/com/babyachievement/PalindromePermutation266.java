package com.babyachievement;

/**
 * https://www.lintcode.com/problem/palindrome-permutation/description
 */
public class PalindromePermutation266 {
    /**
     * @param s: the given string
     * @return: if a permutation of the string could form a palindrome
     */
    public boolean canPermutePalindrome(String s) {
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
        return oddCount<=1;
    }
}
