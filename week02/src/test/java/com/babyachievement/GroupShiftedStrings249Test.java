package com.babyachievement;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/15 17:22
 */
public class GroupShiftedStrings249Test {

    @Test
    public void groupStrings() {
        final GroupShiftedStrings249 shiftedStrings249 = new GroupShiftedStrings249();
        final List<List<String>> lists = shiftedStrings249.groupStrings(new String[]{"abc", "bcd",
                "acef", "xyz", "az", "ba", "a", "z"});
        assertThat(lists.size(), is(4));
        System.out.println(lists);
    }
}