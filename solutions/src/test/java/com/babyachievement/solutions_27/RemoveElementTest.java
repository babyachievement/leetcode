package com.babyachievement.solutions_27;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * FileName:RemoveElementTest
 * Created by HaoQiang
 * Date:17-7-20
 * Time:上午7:45
 */
public class RemoveElementTest {
    @Test
    public void removeElement() throws Exception {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {1};
        int num = removeElement.removeElement(nums, 1);
        assertThat(num, is(0));

        int[] nums2 = {3, 2, 2, 3};
        int num2 = removeElement.removeElement(nums2, 3);
        assertThat(num2, is(2));
        assertThat(nums2[0], is(2));
    }

}