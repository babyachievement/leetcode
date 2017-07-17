package com.babyachievement.solutions_9;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alvin on 2017/7/17.
 */
public class PalindromeNumberTest {
    @Test
    public void isPalindrome() throws Exception {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        assertTrue(palindromeNumber.isPalindrome(1));
//        assertTrue(palindromeNumber.isPalindrome(-1));
//        assertTrue(palindromeNumber.isPalindrome(-11));
//        assertFalse(palindromeNumber.isPalindrome(-12));
        assertTrue(palindromeNumber.isPalindrome(-2147447412));
    }

}