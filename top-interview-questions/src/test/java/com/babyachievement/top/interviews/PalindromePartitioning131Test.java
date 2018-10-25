package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/10/25 9:22
 */
public class PalindromePartitioning131Test {

    @Test
    public void partition() {
        final PalindromePartitioning131 palindromePartitioning131 = new PalindromePartitioning131();
        System.out.println(palindromePartitioning131.partition("a"));
        System.out.println(palindromePartitioning131.partition("ab"));
        System.out.println(palindromePartitioning131.partition("aba"));
        System.out.println(palindromePartitioning131.partition("abac"));
    }
}