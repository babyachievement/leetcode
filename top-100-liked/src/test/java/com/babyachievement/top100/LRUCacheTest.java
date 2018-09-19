package com.babyachievement.top100;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * date: 2018/9/19 14:10
 */
public class LRUCacheTest {

    @Test
    public void testLRUCache() {
        final LRUCache lruCache = new LRUCache(2);
        assertThat(lruCache.get(1), is(-1));
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertThat(lruCache.get(1), is(1));
        lruCache.put(3,3);
        assertThat(lruCache.get(2), is(-1));
        lruCache.put(4,4);
        assertThat(lruCache.get(1), is(-1));
        assertThat(lruCache.get(4), is(4));

        final LRUCache lruCache2 = new LRUCache(1);
        lruCache2.put(2, 1);
        assertThat(lruCache2.get(2), is(1));

    }
}