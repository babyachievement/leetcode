package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/28 13:18
 */
public class FindAllNumbersDisappearedInArray448Test {

    @Test
    public void findDisappearedNumbers() {
        final FindAllNumbersDisappearedInArray448 findAllNumbersDisappearedInArray448 = new FindAllNumbersDisappearedInArray448();
        final List<Integer> disappearedNumbers = findAllNumbersDisappearedInArray448
                .findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertThat(disappearedNumbers.size(), is(2));
    }
}