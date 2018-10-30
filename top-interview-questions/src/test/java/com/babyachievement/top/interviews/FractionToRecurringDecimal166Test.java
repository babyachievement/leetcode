package com.babyachievement.top.interviews;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * date: 2018/10/18 14:59
 */
public class FractionToRecurringDecimal166Test {

    @Test
    public void fractionToDecimal() {
        final FractionToRecurringDecimal166 recurringDecimal166 = new FractionToRecurringDecimal166();
        assertThat(recurringDecimal166.fractionToDecimal(1, 2), is("0.5"));
        assertThat(recurringDecimal166.fractionToDecimal(1, 2), is("0.5"));
        assertThat(recurringDecimal166.fractionToDecimal(2, 1), is("2"));
        assertThat(recurringDecimal166.fractionToDecimal(2, 3), is("0.(6)"));
        assertThat(recurringDecimal166.fractionToDecimal(1, 7), is("0.(142857)"));
        assertThat(recurringDecimal166.fractionToDecimal(-1, Integer.MIN_VALUE), is(
                                                                            "0.0000000004656612873077392578125"));

        assertThat(recurringDecimal166.fractionToDecimal(4, 333), is("0.(012)"));
        assertThat(recurringDecimal166.fractionToDecimal(4, 333), is("0.(012)"));
        assertThat(recurringDecimal166.fractionToDecimal(-50, 8), is("-6.25"));
        assertThat(recurringDecimal166.fractionToDecimal(7, -12), is("-0.58(3)"));
        assertThat(recurringDecimal166.fractionToDecimal(1, 214748364), is("0.00(000000465661289042462740251655654056577585848337359161441621040707904997124914069194026549138227660723878669455195477065427143370461252966751355553982241280310754777158628319049732085502639731402098131932683780538602845887105337854867197032523144157689601770377165713821223802198558308923834223016478952081795603341592860749337303449725)"));
    }
}