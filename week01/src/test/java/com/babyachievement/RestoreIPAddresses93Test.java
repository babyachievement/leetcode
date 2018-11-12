package com.babyachievement;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/11/8 14:08
 */
public class RestoreIPAddresses93Test {

    @Test
    public void restoreIpAddresses() {
        final RestoreIPAddresses93 restoreIPAddresses93 = new RestoreIPAddresses93();
        final List<String>         ips              = restoreIPAddresses93.restoreIpAddresses(
                "25525511135");
        assertThat(ips.size(), is(2));

        System.out.println(ips);
        assertTrue(ips.contains("255.255.11.135"));
        assertTrue(ips.contains("255.255.111.35"));

        final List<String> strings = restoreIPAddresses93.restoreIpAddresses(
                "010010");
        System.out.println(strings);
        assertThat(strings.size(), is(2));

    }
}