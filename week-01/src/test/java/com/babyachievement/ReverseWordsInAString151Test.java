package com.babyachievement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseWordsInAString151Test {

    @Test
    public void reverseWords() {
        ReverseWordsInAString151 wordsInAString151 = new ReverseWordsInAString151();
        assertThat(wordsInAString151.reverseWords(""), is(""));
        assertThat(wordsInAString151.reverseWords("the sky is blue"), is("blue is sky the"));
    }
}