package com.babyachievement.solutions_12;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:Solution3Test
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午9:07
 */
public class Solution3Test {
    @Test
    public void intToRoman() throws Exception {
        Solution3 integerToRoman = new Solution3();
        assertThat(integerToRoman.intToRoman(2016), is("MMXVI"));
        assertThat(integerToRoman.intToRoman(499), is("CDXCIX"));
        assertThat(integerToRoman.intToRoman(1), is("I"));
        assertThat(integerToRoman.intToRoman(4), is("IV"));
        assertThat(integerToRoman.intToRoman(5), is("V"));
        assertThat(integerToRoman.intToRoman(10), is("X"));
        assertThat(integerToRoman.intToRoman(900), is("CM"));
    }

}