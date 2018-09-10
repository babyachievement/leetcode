package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/10 15:25
 */
public class SearchinRotatedSortedArrayTest {

    @Test
    public void search() {
        int search = new SearchinRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2},
                                                             4);
        assertThat(search, is(0));

        search = new SearchinRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2},
                                                         3);


        assertThat(search, is(-1));

        search = new SearchinRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2},
                                                         0);
        assertThat(search, is(4));


        search = new SearchinRotatedSortedArray().search(new int[]{3, 1},
                                                         0);
        assertThat(search, is(-1));


        search = new SearchinRotatedSortedArray().search(new int[]{5, 1, 2, 3,
                4}, 1);
        assertThat(search, is(1));
    }

    @Test
    public void searchWithIterative() {
        SearchinRotatedSortedArray sortedArray = new SearchinRotatedSortedArray();
        int result = sortedArray.searchWithIterative(new int[]{4, 5, 6, 7, 0, 1, 2},
                                                     4);
        assertThat(result, is(0));

        result = sortedArray.searchWithIterative(new int[]{4, 5, 6, 7, 0, 1, 2},
                                                 3);

        assertThat(result, is(-1));

        result = sortedArray.searchWithIterative(new int[]{4, 5, 6, 7, 0, 1, 2},
                                                 0);
        assertThat(result, is(4));


        result = sortedArray.searchWithIterative(new int[]{3, 1}, 0);
        assertThat(result, is(-1));

        result = sortedArray.searchWithIterative(new int[]{1, 3}, 1);
        assertThat(result, is(0));


        result = sortedArray.searchWithIterative(new int[]{5, 1, 3}, 3);
        assertThat(result, is(2));


        result = sortedArray.searchWithIterative(new int[]{5, 1, 2, 3, 4}, 1);
        assertThat(result, is(1));
    }
}