package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/11 10:11
 */
public class LetterCombinationsPhoneNumber17Test {

    @Test
    public void letterCombinations() {
        final LetterCombinationsPhoneNumber17 phoneNumber17 = new LetterCombinationsPhoneNumber17();
        final List<String>                    strings       = phoneNumber17.letterCombinations(
                "23");
        assertThat(strings.size(), is(9));
        assertThat(phoneNumber17.letterCombinations("").size(), is(0));
        assertThat(phoneNumber17.letterCombinations("9").size(), is(4));
        assertThat(phoneNumber17.letterCombinations("9").get(0), is("w"));

    }
}