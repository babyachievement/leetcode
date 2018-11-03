package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BasicCalculatorII227Test {

    @Test
    public void calculate() {
        BasicCalculatorII227 basicCalculatorII227 = new BasicCalculatorII227();
        assertThat(basicCalculatorII227.calculate("3+2*2"), is(7));
        assertThat(basicCalculatorII227.calculate(" 3+5 / 2 "), is(5));
        assertThat(basicCalculatorII227.calculate("0"), is(0));
        assertThat(basicCalculatorII227.calculate("1-1+1"), is(1));
        assertThat(basicCalculatorII227.calculate("1-2+1"), is(0));
        assertThat(basicCalculatorII227.calculate("1+1-1"), is(1));
    }
}