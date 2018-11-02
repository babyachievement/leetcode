package com.babyachievement.top.interviews;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * date: 2018/11/2 10:40
 */
public class NestedIterator341Test {

    @Test
    public void next() {

        final NestedIterator341 nestedIterator341 = new NestedIterator341(initNestedInteger1());

        while (nestedIterator341.hasNext()) {
            System.out.println(nestedIterator341.next());
        }

        final NestedIterator341 nestedIterator2 = new NestedIterator341
                (initNestedInteger2());

        while (nestedIterator2.hasNext()) {
            System.out.println(nestedIterator2.next());
        }
    }

    List<NestedInteger> initNestedInteger1() {

        List<NestedInteger> list = new ArrayList<>();
        list.add(new MyNestedInteger(Arrays.asList(new MyNestedInteger(1), new MyNestedInteger(1))));
        list.add(new MyNestedInteger(2));
        list.add(new MyNestedInteger(Arrays.asList(new MyNestedInteger(3),
                                                   new MyNestedInteger(3))));


        return list;

    }


    List<NestedInteger> initNestedInteger2() {

        List<NestedInteger> list = new ArrayList<>();
        list.add(new MyNestedInteger(1));
        list.add(new MyNestedInteger(Arrays.asList(new MyNestedInteger(4),
                                                   new MyNestedInteger(Arrays
                                                                               .asList(new MyNestedInteger(6))))));


        return list;

    }

    private static class MyNestedInteger implements NestedInteger {
        Integer v;
        boolean isInteger;
        private List<NestedInteger> list;

        public MyNestedInteger(Integer v) {
            this.v = v;
            this.isInteger = true;
        }

        public MyNestedInteger(List<NestedInteger> list) {
            this.list = list;
            this.isInteger = false;
        }

        @Override
        public boolean isInteger() {
            return isInteger;
        }

        @Override
        public Integer getInteger() {
            return this.v;
        }

        @Override
        public List<NestedInteger> getList() {
            return this.list;
        }
    }
}