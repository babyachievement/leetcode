package com.babyachievement.top100;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        String[] strings = {"tea","and","ate","eat","den"};

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lists = groupAnagrams.groupAnagrams(strings);
        System.out.println(lists);
    }
}