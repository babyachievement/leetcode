package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/11 10:29
 */
public class GenerateParentheses22Test {

    @Test
    public void generateParenthesis() {
        final GenerateParentheses22 parentheses22 = new GenerateParentheses22();
        final List<String> parenthesis = parentheses22.generateParenthesis(3);
        assertThat(parenthesis.size(), is(5));
        assertThat(parentheses22.generateParenthesis(0).size(), is(0));
        System.out.println(parenthesis);
    }
}