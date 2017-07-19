package com.babyachievement.solutions_20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * FileName:ValidParenthesesTest
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午10:19
 */
public class ValidParenthesesTest {
    @Test
    public void isValid() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        assertFalse(validParentheses.isValid(null));
        assertTrue(validParentheses.isValid(""));

        assertFalse(validParentheses.isValid("()[]({]}"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertTrue(validParentheses.isValid("[()]{}"));
        assertFalse(validParentheses.isValid("]"));
        assertFalse(validParentheses.isValid("]]"));
        assertFalse(validParentheses.isValid("{"));
        assertFalse(validParentheses.isValid("{{"));
        assertFalse(validParentheses.isValid("(}(({(}()(({)](({["));

    }

}