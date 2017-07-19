package com.babyachievement.solutions_20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * FileName:ValidParentheses2Test
 * Created by HaoQiang
 * Date:17-7-19
 * Time:下午10:59
 */
public class ValidParentheses2Test {
    @Test
    public void isValid() throws Exception {
        ValidParentheses2 validParentheses = new ValidParentheses2();
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