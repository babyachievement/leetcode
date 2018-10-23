package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/23 16:25
 */
public class ValidPalindrome125Test {

    @Test
    public void isPalindrome() {
        final ValidPalindrome125 validPalindrome125 = new ValidPalindrome125();
        assertTrue(validPalindrome125.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(validPalindrome125.isPalindrome(" "));
        assertFalse(validPalindrome125.isPalindrome("race a car"));
        assertFalse(validPalindrome125.isPalindrome("0P"));
        System.out.println(Character.isAlphabetic(' '));
    }
}