/**
 * date: 2018/11/15 16:30
 */

package com.babyachievement;

import java.util.Iterator;
import java.util.List;

public class Flatten2DVector251 implements Iterator<Integer> {

    private Iterator<List<Integer>> vecIter;
    private Iterator<Integer>       iterator;

    public Flatten2DVector251(List<List<Integer>> vec2d) {
        // Initialize your data structure here
        vecIter = vec2d.iterator();
        iterator = vecIter.hasNext() ? vecIter.next().iterator() : null;
    }

    @Override
    public Integer next() {
        // Write your code here
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        if(iterator==null) return false;
        // Write your code here
        while (vecIter.hasNext() && !iterator.hasNext()) {
            iterator = vecIter.next().iterator();
        }

        return null!=iterator&&iterator.hasNext();
    }

    @Override
    public void remove() {
        iterator.remove();
    }
}

