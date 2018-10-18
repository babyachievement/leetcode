package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * date: 2018/10/18 11:33
 */
public class ExcelSheetColumnNumber171Test {

    @Test
    public void titleToNumber() {
        final ExcelSheetColumnNumber171 sheetColumnNumber171 = new ExcelSheetColumnNumber171();
        assertThat(sheetColumnNumber171.titleToNumber("A"), is(1));
        assertThat(sheetColumnNumber171.titleToNumber("AB"), is(28));
    }
}