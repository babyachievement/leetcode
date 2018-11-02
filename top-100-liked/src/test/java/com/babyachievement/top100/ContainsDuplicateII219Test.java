package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * date: 2018/11/2 17:01
 */
public class ContainsDuplicateII219Test {

    @Test
    public void containsNearbyDuplicate() {
        final ContainsDuplicateII219 duplicateII219 = new ContainsDuplicateII219();
        assertTrue(duplicateII219.containsNearbyDuplicate(new int[]{1, 2, 3, 1},
                                                          3));
        assertTrue(duplicateII219.containsNearbyDuplicate(new int[]{1, 0, 1, 1},
                                                          1));
        assertFalse(duplicateII219.containsNearbyDuplicate(new int[]{1, 2, 3, 1,
                2, 3}, 2));
    }
}