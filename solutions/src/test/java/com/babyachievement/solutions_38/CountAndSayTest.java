package com.babyachievement.solutions_38;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:CountAndSayTest
 * Created by HaoQiang
 * Date:17-7-30
 * Time:下午11:49
 */
public class CountAndSayTest {
    @Test
    public void countAndSay() throws Exception {
        CountAndSay countAndSay = new CountAndSay();
        assertThat(countAndSay.countAndSay(1), is("1"));
        assertThat(countAndSay.countAndSay(2), is("11"));
        assertThat(countAndSay.countAndSay(3), is("21"));
        assertThat(countAndSay.countAndSay(4), is("1211"));
        assertThat(countAndSay.countAndSay(5), is("111221"));
    }

}