package org.babyachievement.algorithms.binarytree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * date: 2018/9/11 10:51
 */
public class AddAndSearchWordTest {

    @Test
    public void search() {
        AddAndSearchWord addAndSearchWord = new AddAndSearchWord();

        addAndSearchWord.addWord("at");
        addAndSearchWord.addWord("and");
        addAndSearchWord.addWord("an");
        addAndSearchWord.addWord("add");
        assertFalse(addAndSearchWord.search("a"));
        assertFalse(addAndSearchWord.search(".at"));
        addAndSearchWord.addWord("bat");
        assertTrue(addAndSearchWord.search(".at"));
        assertTrue(addAndSearchWord.search("an."));
        assertFalse(addAndSearchWord.search("a.d."));
        assertFalse(addAndSearchWord.search("b."));
        assertTrue(addAndSearchWord.search("a.d"));
        assertFalse(addAndSearchWord.search("."));
    }

    @Test
    public void test2() {
        AddAndSearchWord addAndSearchWord = new AddAndSearchWord();
        addAndSearchWord.addWord("a");
        addAndSearchWord.addWord("ab");
        assertFalse(addAndSearchWord.search(".a"));
    }
}