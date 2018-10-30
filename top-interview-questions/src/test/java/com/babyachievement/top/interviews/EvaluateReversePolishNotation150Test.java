package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/30 10:55
 */
public class EvaluateReversePolishNotation150Test {

    @Test
    public void evalRPN() {
        final EvaluateReversePolishNotation150 polishNotation150 = new EvaluateReversePolishNotation150();
        assertThat(polishNotation150.evalRPN(new String[]{"2", "1", "+", "3", "*"}), is(9));
        assertThat(polishNotation150.evalRPN(new String[]{"4", "13", "5", "/", "+"}), is(6));
        assertThat(polishNotation150.evalRPN(new String[]{"10", "6", "9",
                "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}), is(22));
    }
}